public class InsertionSort {

    public void insertionSortAscending(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            int jumlahGeser = 0;

            // Geser elemen yang LEBIH BESAR dari key ke kanan
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                jumlahGeser++;
            }
            arr[j + 1] = key;

            printPass(i, arr, key, jumlahGeser, j + 1, i);
        }
    }

    public void insertionSortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            int jumlahGeser = 0;

            // Geser elemen yang LEBIH KECIL dari key ke kanan
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
                jumlahGeser++;
            }
            arr[j + 1] = key;

            printPass(i, arr, key, jumlahGeser, j + 1, i);
        }
    }

    // Tanda "|" memisahkan bagian terurut (kiri) dan belum terurut (kanan)
    private void printPass(int pass, int[] arr, int key, int jumlahGeser, int posisiBaru, int posisiAsal) {
        System.out.print("Pass " + pass + ": ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
            if (k == pass && k < arr.length - 1) {
                System.out.print("| ");
            }
        }
        System.out.println();
        if (jumlahGeser == 0) {
            System.out.println("  (key = " + key + ", sudah di posisi benar, tanpa pergeseran)");
        } else {
            System.out.println("  (key = " + key + ", geser " + jumlahGeser
                    + " elemen, disisipkan dari index " + posisiAsal + " ke index " + posisiBaru + ")");
        }
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}