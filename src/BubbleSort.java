public class BubbleSort {

    // Bubble Sort Ascending (kecil -> besar)
    public void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            int jumlahSwap = 0;

            for (int j = 0; j < n - i - 1; j++) {
                // tukar jika elemen kiri lebih besar
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    jumlahSwap++;
                }
            }

            printPass(i + 1, arr, jumlahSwap);

            // stop jika sudah urut
            if (!swapped) {
                System.out.println("  -> Tidak ada pertukaran, data sudah terurut. Proses dihentikan.");
                break;
            }
        }
    }

    // Bubble Sort Descending (besar -> kecil)
    public void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            int jumlahSwap = 0;

            for (int j = 0; j < n - i - 1; j++) {
                // tukar jika elemen kiri lebih kecil
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    jumlahSwap++;
                }
            }

            printPass(i + 1, arr, jumlahSwap);

            if (!swapped) {
                System.out.println("  -> Tidak ada pertukaran, data sudah terurut. Proses dihentikan.");
                break;
            }
        }
    }

    private void printPass(int pass, int[] arr, int jumlahSwap) {
        System.out.print("Pass " + pass + ": ");
        printArray(arr);
        System.out.println("  (jumlah swap: " + jumlahSwap + ")");
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}