package sorting;

public class Main {

    public static void main(String[] args) {
	    int[] A=range(1,20000);
        long startTime;
        long duration;

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

    }

    public static int[] range(int start,int stop){
        int[] a=new int[stop-start];
        for(int i=0;i<stop-start;i++){
            a[i]=start+i;
        }
        return a;
    }
}
