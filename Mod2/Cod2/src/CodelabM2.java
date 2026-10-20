public class CodelabM2 {

    // =========================================
    // INSERTION SORT DESCENDING (RACE WINS)
    // =========================================
    static void insertionSortDescending(
            int raceWins[],
            String names[]
    ) {

        int n = raceWins.length;

        // iterate through array elements
        for (int i = 1; i < n; i++) {

            int keyWins = raceWins[i];
            String keyName = names[i];

            // start comparing from previous index
            int j = i - 1;

            // move elements while condition holds
            while (j >= 0 && raceWins[j] < keyWins) {

                raceWins[j + 1] = raceWins[j];
                names[j + 1] = names[j];

                j--;
            }

            raceWins[j + 1] = keyWins;
            names[j + 1] = keyName;
        }
    }

    // =========================================
    // SHELL SORT DESCENDING (RACE WINS)
    // =========================================
    static void shellSortDescending(
            int raceWins[],
            String names[]
    ) {

        int n = raceWins.length;

        // initial gap is half of array size
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // start from gap index
            for (int i = gap; i < n; i++) {

                int tempWins = raceWins[i];
                String tempName = names[i];

                int j = i;

                // compare elements separated by gap
                while (j >= gap &&
                        raceWins[j - gap] < tempWins) {

                    raceWins[j] = raceWins[j - gap];
                    names[j] = names[j - gap];

                    // move backwards by gap
                    j -= gap;
                }

                raceWins[j] = tempWins;
                names[j] = tempName;
            }
        }
    }

    // =========================================
    // PRINT DATA
    // =========================================
    static void printData(
            int raceWins[],
            String names[]
    ) {

        for (int i = 0; i < raceWins.length; i++) {

            System.out.println(
                    names[i] + " - " + raceWins[i]
            );
        }
    }

    // =========================================
    // MAIN PROGRAM
    // =========================================
    public static void main(String[] args) {

        String[] names = {
                "Special Week", "Tokai Teio", "Mejiro McQueen", "Gold Ship", "Silence Suzuka",
                "Rice Shower", "Vodka", "Daiwa Scarlet", "Oguri Cap", "Narita Brian",
                "Symboli Rudolf", "Mayano Top Gun", "Air Groove", "Grass Wonder", "El Condor Pasa",
                "Biwa Hayahide", "Winning Ticket", "Matikanetannhauser", "Nice Nature", "Twin Turbo"
        };

        // Interpreted as number of race wins
        int[] insertionData = {
                7, 5, 6, 8, 4,
                3, 5, 6, 7, 5,
                9, 4, 5, 6, 5,
                4, 3, 5, 3, 2
        };

        int[] shellData = insertionData.clone();
        String[] shellNames = names.clone();

        System.out.println("=== Original Data ===");
        printData(insertionData, names);

        insertionSortDescending(insertionData, names);
        System.out.println("\n=== Insertion Sort (Descending) ===");
        printData(insertionData, names);

        shellSortDescending(shellData, shellNames);
        System.out.println("\n=== Shell Sort (Descending) ===");
        printData(shellData, shellNames);
    }
}