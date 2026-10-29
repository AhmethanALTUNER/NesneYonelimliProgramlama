package Matris;
import java.util.ArrayList;
import java.util.Scanner;

public class Matris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu (n) girin: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Rastgele oluşturulan dizi:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        ArrayList<Integer> maxRowIndices = new ArrayList<>();
        int maxRowCount = 0;

        for (int i = 0; i < n; i++) {
            int rowCount = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }

            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRowIndices.clear();
                maxRowIndices.add(i);
            } else if (rowCount == maxRowCount && maxRowCount > 0) {
                maxRowIndices.add(i);
            }
        }

        ArrayList<Integer> maxColIndices = new ArrayList<>();
        int maxColCount = 0;

        for (int j = 0; j < n; j++) {
            int colCount = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == 1) {
                    colCount++;
                }
            }

            if (colCount > maxColCount) {
                maxColCount = colCount;
                maxColIndices.clear();
                maxColIndices.add(j);
            } else if (colCount == maxColCount && maxColCount > 0) {
                maxColIndices.add(j);
            }
        }

        printResults("satır", maxRowIndices);
        printResults("sütun", maxColIndices);

        scanner.close();
    }

    private static void printResults(String type, ArrayList<Integer> indices) {
        if (indices.isEmpty()) {
            System.out.println("Matriste hiç 1 bulunan " + type + " yok.");
            return;
        }

        String label = indices.size() > 1 ? type + " indisleri: " : type + " indisi: ";
        System.out.print("En fazla 1 içeren " + label);

        for (int i = 0; i < indices.size(); i++) {
            System.out.print(indices.get(i));
            if (i < indices.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
