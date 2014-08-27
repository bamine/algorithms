package dataStructures;

/**
 * Created by amine on 28/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class heapUtil {

    public static heap buildMaxHeap(int[] A) {
        heap maxHeap = new heap(A);
        for (int i = maxHeap.getLength() / 2 - 1; i >= 0; i--) {
            maxHeapify(maxHeap, i);
        }
        return maxHeap;
    }
    public static void maxHeapify(heap A, int i) {
        int l = left(i);
        int r = right(i);
        int largest;
        if (l <= A.getHeapsize() && A.get(l) > A.get(i)) {
            largest = l;
        } else {
            largest = i;
        }
        if (r <= A.getHeapsize() && A.get(r) > A.get(largest)) {
            largest = r;
        }
        if (largest != i) {
            A.swap(i, largest);
            maxHeapify(A, largest);
        }
    }

    public static int left(int i) {
        return 2 * i + 1;
    }

    public static int right(int i) {
        return 2 * i + 2;
    }

    public static int parent(int i) {
        return i / 2;
    }
}
