package sorting;

import dataStructures.Heap;
import dataStructures.HeapHelper;

/**
 * Created with IntelliJ IDEA.
 * User: Amine
 * Date: 29/08/14
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public class HeapSorter {
    public static int[] sort(int[] A) {
        Heap H = HeapHelper.buildMaxHeap(A);
        for (int i = H.getLength() - 1; i > 0; i--) {
            H.swap(0, i);
            H.setHeapsize(H.getHeapsize() - 1);
            HeapHelper.maxHeapify(H, 0);
        }
        return H.getArray();
    }
}
