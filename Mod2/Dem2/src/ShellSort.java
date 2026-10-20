public class ShellSort {

    public void shellSortAscending(int[] arr) {
        int n = arr.length;
        int tahap = 1;

        // Gap awal n/2, dikurangi setengah tiap tahap sampai 1
        for (int gap = n / 2; gap > 0; gap /= 2) {
            int jumlahGeser = 0;

            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                    jumlahGeser++;
                }
                arr[j] = temp;
            }

            printTahap(tahap++, gap, arr, jumlahGeser);
        }
    }

    public void shellSortDescending(int[] arr) {
        int n = arr.length;
        int tahap = 1;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            int jumlahGeser = 0;

            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] < temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                    jumlahGeser++;
                }
                arr[j] = temp;
            }

            printTahap(tahap++, gap, arr, jumlahGeser);
        }
    }

    private void printTahap(int tahap, int gap, int[] arr, int jumlahGeser) {
        System.out.print("Tahap " + tahap + " (gap = " + gap + "): ");
        printArray(arr);
        System.out.println();
        System.out.println("  (jumlah pergeseran: " + jumlahGeser + ")");
        if (gap == 1) {
            System.out.println("  -> Gap = 1, tahap terakhir (setara Insertion Sort biasa).");
        }
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}