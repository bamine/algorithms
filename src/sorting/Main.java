package sorting;

public class Main {

    public static void main(String[] args) {
	    int[] A=range(1,100);
        long startTime;
        long duration;

        startTime=System.nanoTime();
        BinarySearcher.search(7,A);
        duration=System.nanoTime()-startTime;
        System.out.println("Took "+duration+"\n");

        FisherYatesShuffler.shuffleArray(A);
        startTime=System.nanoTime();
        InsertionSorter.sort(A);
        duration=System.nanoTime()-startTime;
        System.out.println("Insertion sort :");
        printList(A);
        System.out.println("Took "+duration+"\n");

        FisherYatesShuffler.shuffleArray(A);
        startTime=System.nanoTime();
        SelectionSorter.sort(A);
        duration=System.nanoTime()-startTime;
        System.out.println("Selection sort :");
        printList(A);
        System.out.println("Took "+duration+"\n");

        FisherYatesShuffler.shuffleArray(A);
        startTime=System.nanoTime();
        MergeSorter.sort(A,1,A.length);
        duration=System.nanoTime()-startTime;
        System.out.println("Merge sort :");
        printList(A);
        System.out.println("Took "+duration+"\n");

        FisherYatesShuffler.shuffleArray(A);
        startTime=System.nanoTime();
        MergeSorter.sortWithoutSentinels(A, 1, A.length);
        duration=System.nanoTime()-startTime;
        System.out.println("Merge sort without sentinels :");
        printList(A);
        System.out.println("Took "+duration+"\n");

        FisherYatesShuffler.shuffleArray(A);
        startTime=System.nanoTime();
        InsertionSorter.sortRecursive(A, A.length - 1);
        duration=System.nanoTime()-startTime;
        System.out.println("Insertion sort recursive version :");
        printList(A);
        System.out.println("Took "+duration+"\n");

        FisherYatesShuffler.shuffleArray(A);
        startTime = System.nanoTime();
        BubbleSorter.sort(A);
        duration = System.nanoTime() - startTime;
        System.out.println("Bubble sort :");
        printList(A);
        System.out.println("Took " + duration + "\n");

        int[] B = {1, 2, 5, 3, 4, 6, 7, 8, 9};
        System.out.println("Number of inversions of B " + InversionCounter.count(B, 1, B.length));

    }

    private static void printList(int[] a) {
        for(int i: a){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }

    public static int[] range(int start,int stop){
        int[] a=new int[stop-start];
        for(int i=0;i<stop-start;i++){
            a[i]=start+i;
        }
        return a;
    }
}
