public class SelectionSort {

    // Selection Sort Ascending: cari nilai terkecil
    public void selectionSortAscending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // anggap posisi saat ini adalah nilai terkecil
            int min_idx = i;

            // telusuri bagian yang belum terurut
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // pindahkan nilai terkecil ke posisi i
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

            printPass(i + 1, arr, "terkecil", arr[i], i, min_idx);
        }
    }

    // Selection Sort Descending: cari nilai terbesar
    public void selectionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // anggap posisi saat ini adalah nilai terbesar
            int max_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max_idx]) {
                    max_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[max_idx];
            arr[max_idx] = temp;

            printPass(i + 1, arr, "terbesar", arr[i], i, max_idx);
        }
    }

    private void printPass(int pass, int[] arr, String jenis, int nilai, int dari, int ke) {
        System.out.print("Pass " + pass + ": ");
        printArray(arr);
        if (dari == ke) {
            System.out.println("  (" + jenis + " = " + nilai + ", sudah di posisi benar, tanpa swap)");
        } else {
            System.out.println("  (" + jenis + " = " + nilai + ", swap index " + dari + " <-> " + ke + ")");
        }
    }

    public void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}