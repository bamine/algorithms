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
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("Took "+duration+"\n");

        FisherYatesShuffler.shuffleArray(A);
        startTime=System.nanoTime();
        SelectionSorter.sort(A);
        duration=System.nanoTime()-startTime;
        System.out.println("Selection sort :");
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("Took "+duration+"\n");

        FisherYatesShuffler.shuffleArray(A);
        startTime=System.nanoTime();
        MergeSorter.sort(A,1,A.length);
        duration=System.nanoTime()-startTime;
        System.out.println("Merge sort :");
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("Took "+duration+"\n");

        FisherYatesShuffler.shuffleArray(A);
        startTime=System.nanoTime();
        MergeSorter.sortWithoutSentinels(A, 1, A.length);
        duration=System.nanoTime()-startTime;
        System.out.println("Merge sort without sentinels :");
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("Took "+duration+"\n");

        FisherYatesShuffler.shuffleArray(A);
        startTime=System.nanoTime();
        InsertionSorter.sortRecursive(A, A.length - 1);
        duration=System.nanoTime()-startTime;
        System.out.println("Insertion sort recursive version :");
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("Took "+duration+"\n");

        FisherYatesShuffler.shuffleArray(A);
        startTime = System.nanoTime();
        BubbleSorter.sort(A);
        duration = System.nanoTime() - startTime;
        System.out.println("Bubble sort :");
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.println("Took " + duration + "\n");

        int[] B = {1, 2, 5, 3, 4, 6, 7, 8, 9};
        System.out.println("Number of inversions of B " + InversionCounter.count(B, 1, B.length));

    }

    public static int[] range(int start,int stop){
        int[] a=new int[stop-start];
        for(int i=0;i<stop-start;i++){
            a[i]=start+i;
        }
        return a;
    }
}
