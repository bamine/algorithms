package dataStructures;

/**
 * Created by amine on 28/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class heap {
    private int[] A;
    private int heapsize;

    public int getHeapsize() {
        return heapsize;
    }

    public int get(int i) {
        return A[i];
    }

    public void swap(int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public int left(int i) {
        return 2 * i;
    }

    public int right(int i) {
        return 2 * i + 1;
    }

    public int parent(int i) {
        return i / 2;
    }
}
