package dataStructures;

/**
 * Created by amine on 28/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class heapUtil {

    public static heap buildMaxHeap(int[] A) {
        heap maxHeap = new heap(A);
        for (int i = (maxHeap.getLength() / 2) - 1; i >= 0; i--) {
            maxHeapify(maxHeap, i);
        }
        return maxHeap;
    }

    public static ternaryHeap buildMaxTernaryHeap(int[] A) {
        ternaryHeap maxHeap = new ternaryHeap(A);
        for (int i = ((2 * maxHeap.getLength()) / 3) - 1; i >= 0; i--) {
            maxHeapifyTernary(maxHeap, i);
        }
        return maxHeap;
    }

    public static heap buildMaxHeapInsert(int[] A) {
        int[] empty = new int[1];
        empty[0] = A[0];
        heap H = new heap(empty);
        H.setHeapsize(1);
        for (int i = 1; i < A.length; i++) {
            H.maxHeapInsert(A[i]);
        }
        return H;
    }

    public static heap buildMinHeap(int[] A) {
        heap maxHeap = new heap(A);
        for (int i = (maxHeap.getLength() / 2) - 1; i >= 0; i--) {
            minHeapify(maxHeap, i);
        }
        return maxHeap;
    }
    public static void maxHeapify(heap A, int i) {
        int l = left(i);
        int r = right(i);
        int largest;
        if (l <= A.getHeapsize() - 1 && A.get(l) > A.get(i)) {
            largest = l;
        } else {
            largest = i;
        }
        if (r <= A.getHeapsize() - 1 && A.get(r) > A.get(largest)) {
            largest = r;
        }
        if (largest != i) {
            A.swap(i, largest);
            maxHeapify(A, largest);
        }
    }

    public static void maxHeapifyTernary(ternaryHeap A, int i) {
        int l = leftTernary(i);
        int r = rightTernary(i);
        int m = middleTernary(i);
        int largest;
        if (l <= A.getHeapsize() - 1 && A.get(l) > A.get(i)) {
            largest = l;
        } else if (m <= A.getHeapsize() - 1 && A.get(m) > A.get(i)) {
            largest = m;
        } else {
            largest = i;
        }
        if (r <= A.getHeapsize() - 1 && A.get(r) > A.get(largest)) {
            largest = r;
        }
        if (largest != i) {
            A.swap(i, largest);
            maxHeapifyTernary(A, largest);
        }
    }

    public static void minHeapify(heap A, int i) {
        int l = left(i);
        int r = right(i);
        int smallest;
        if (l <= A.getHeapsize() - 1 && A.get(l) < A.get(i)) {
            smallest = l;
        } else {
            smallest = i;
        }
        if (r <= A.getHeapsize() - 1 && A.get(r) < A.get(smallest)) {
            smallest = r;
        }
        if (smallest != i) {
            A.swap(i, smallest);
            minHeapify(A, smallest);
        }
    }

    public static int left(int i) {
        return 2 * i + 1;
    }

    public static int right(int i) {
        return 2 * i + 2;
    }

    public static int leftTernary(int i) {
        return 3 * i + 1;
    }

    public static int rightTernary(int i) {
        return 3 * i + 2;
    }

    public static int middleTernary(int i) {
        return 3 * i + 2;
    }
}
