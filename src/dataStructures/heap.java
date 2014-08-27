package dataStructures;

/**
 * Created by amine on 28/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class heap {
    private int[] A;
    private int heapsize;

    public heap(int[] A) {
        this.A = A;
        this.heapsize = A.length;
    }

    public int getLength() {
        return A.length;
    }
    public int getHeapsize() {
        return heapsize;
    }

    public int get(int i) {
        return A[i];
    }

    public void display() {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(" ");
    }

    public void swap(int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public int left(int i) {
        return 2 * i + 1;
    }

    public int right(int i) {
        return 2 * i + 2;
    }

    public int parent(int i) {
        return i / 2;
    }
}
