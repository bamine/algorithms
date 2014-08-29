package dataStructures;

/**
 * Created by amine on 28/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class Main {
    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        int[] B = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        heap H = heapUtil.buildMaxHeap(A);
        H.display();

        heap M =heapUtil.buildMinHeap(A);
        M.display();

        heap I = heapUtil.buildMaxHeapInsert(B);
        I.display();

        ternaryHeap T = heapUtil.buildMaxTernaryHeap(B);
        T.display();
        System.out.println(T.heapExtractMax());
    }
}
