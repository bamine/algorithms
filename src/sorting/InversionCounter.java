package sorting;

/**
 * Created by amine on 23/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class InversionCounter {
    public static int count(int[] A, int p, int r) {
        int inversions = 0;
        if (p < r) {
            int q = (p + r) / 2;
            inversions += count(A, p, q);
            inversions += count(A, q + 1, r);
            inversions += mergeInversions(A, p, q, r);
        }
        return inversions;
    }

    private static int mergeInversions(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        int i;
        int j;
        for (i = 0; i < n1; i++) {
            L[i] = A[p + i - 1];
        }
        for (j = 0; j < n2; j++) {
            R[j] = A[q + j];
        }
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        i = 0;
        j = 0;
        int inversions = 0;
        boolean counted = false;
        for (int k = p - 1; k < r; k++) {
            if (!counted && R[j] < L[i]) {
                inversions += (n1 - i);
                counted = true;
            }
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
                counted = false;
            }
        }
        return inversions;
    }
}
