package sorting;

/**
 * Created by amine on 23/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class BubbleSorter {
    public static void sort(int[] A) {
        int temp;
        for (int i = 0; i < A.length; i++) {
            for (int j = A.length - 1; j > i; j--) {
                if (A[j] < A[j - 1]) {
                    temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
            }
        }
    }
}
