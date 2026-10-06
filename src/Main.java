import java.util.Scanner;

public class Main {

    // Salin array secara manual agar data asli tidak berubah
    static int[] salin(int[] sumber) {
        int[] hasil = new int[sumber.length];
        for (int i = 0; i < sumber.length; i++) {
            hasil[i] = sumber[i];
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BubbleSort bubble = new BubbleSort();
        SelectionSort selection = new SelectionSort();

        // Data jumlah likes postingan Z-App
        int[] likes = {120, 45, 300, 87, 15, 250, 66, 410, 5, 99};

        boolean jalan = true;
        while (jalan) {
            System.out.println("\n===== Z-APP: Post Popularity Ranking =====");
            System.out.println("Pilih algoritma sorting:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int algo = input.nextInt();

            if (algo == 0) {
                System.out.println("Terima kasih, keluar dari Z-App.");
                break;
            }
            if (algo != 1 && algo != 2) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.println("\nPilih urutan sorting:");
            System.out.println("1. Ascending (likes terkecil -> terbanyak)");
            System.out.println("2. Descending (likes terbanyak -> terkecil)");
            System.out.print("Pilihan: ");
            int urutan = input.nextInt();

            if (urutan != 1 && urutan != 2) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            int[] data = salin(likes);

            System.out.print("\nArray awal : ");
            bubble.printArray(data);
            System.out.println("\n");

            if (algo == 1) {
                System.out.println(">> Bubble Sort " + (urutan == 1 ? "Ascending" : "Descending"));
                if (urutan == 1) bubble.bubbleSortAscending(data);
                else bubble.bubbleSortDescending(data);
            } else {
                System.out.println(">> Selection Sort " + (urutan == 1 ? "Ascending" : "Descending"));
                if (urutan == 1) selection.selectionSortAscending(data);
                else selection.selectionSortDescending(data);
            }

            System.out.print("\nHasil akhir: ");
            bubble.printArray(data);
            System.out.println();
        }
        input.close();
    }
}