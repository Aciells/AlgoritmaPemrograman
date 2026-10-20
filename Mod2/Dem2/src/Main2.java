import java.util.Random;
import java.util.Scanner;

public class Main2 {

    static int[] salin(int[] sumber) {
        int[] hasil = new int[sumber.length];
        for (int i = 0; i < sumber.length; i++) {
            hasil[i] = sumber[i];
        }
        return hasil;
    }

    // Dataset: jumlah pengikut 100 influencer (seed tetap, jadi hasilnya selalu sama)
    static int[] buatDataInfluencer(int jumlah) {
        Random rnd = new Random(2026);
        int[] data = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            data[i] = 1000 + rnd.nextInt(5_000_000); // 1.000 - 5.000.999 pengikut
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BubbleSort bubble = new BubbleSort();
        SelectionSort selection = new SelectionSort();
        InsertionSort insertion = new InsertionSort();
        ShellSort shell = new ShellSort();

        int[] followers = buatDataInfluencer(100);

        while (true) {
            System.out.println("\n===== Z-APP: Top 100 Influencer Ranking =====");
            System.out.println("Pilih algoritma sorting:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Shell Sort");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int algo = input.nextInt();

            if (algo == 0) {
                System.out.println("Terima kasih, keluar dari Z-App.");
                break;
            }
            if (algo < 1 || algo > 4) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            System.out.println("\nPilih urutan sorting:");
            System.out.println("1. Ascending (pengikut tersedikit -> terbanyak)");
            System.out.println("2. Descending (pengikut terbanyak -> tersedikit)");
            System.out.print("Pilihan: ");
            int urutan = input.nextInt();

            if (urutan != 1 && urutan != 2) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            int[] data = salin(followers);
            String namaUrutan = (urutan == 1 ? "Ascending" : "Descending");

            System.out.print("\nArray awal : ");
            bubble.printArray(data);
            System.out.println("\n");

            switch (algo) {
                case 1:
                    System.out.println(">> Bubble Sort " + namaUrutan);
                    if (urutan == 1) bubble.bubbleSortAscending(data);
                    else bubble.bubbleSortDescending(data);
                    break;
                case 2:
                    System.out.println(">> Selection Sort " + namaUrutan);
                    if (urutan == 1) selection.selectionSortAscending(data);
                    else selection.selectionSortDescending(data);
                    break;
                case 3:
                    System.out.println(">> Insertion Sort " + namaUrutan);
                    if (urutan == 1) insertion.insertionSortAscending(data);
                    else insertion.insertionSortDescending(data);
                    break;
                case 4:
                    System.out.println(">> Shell Sort " + namaUrutan);
                    if (urutan == 1) shell.shellSortAscending(data);
                    else shell.shellSortDescending(data);
                    break;
            }

            System.out.print("\nHasil akhir: ");
            bubble.printArray(data);
            System.out.println();
        }
        input.close();
    }
}