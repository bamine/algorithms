package sorting;

import java.util.Random;

/**
 * Created by amine on 30/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class QuickSorter {
    public static void sort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            sort(A, p, q - 1);
            sort(A, q + 1, r);
        }

    }

    public static void randomizedSort(int[] A, int p, int r) {
        if (p < r) {
            int q = randomizedPartition(A, p, r);
            randomizedSort(A, p, q - 1);
            randomizedSort(A, q + 1, r);
        }
    }

    private static int randomizedPartition(int[] A, int p, int r) {
        Random rnd = new Random();
        int i = p + rnd.nextInt(r + 1 - p);
        swap(A, i, r);
        return partition(A, p, r);
    }

    private static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, r);
        return i + 1;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
