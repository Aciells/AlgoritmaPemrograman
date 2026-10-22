public class QuickSortDescending {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // Descending: elemen lebih besar dari pivot dipindah ke kiri
            if (arr[j] > pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] data = {10, 7, 8, 9, 1, 5};
        quickSort(data, 0, data.length - 1);
        System.out.print("Sorted Array (Descending): ");
        for (int value : data) {
            System.out.print(value + " ");
        }
    }
}