package sorting;

public class Main {

    public static void main(String[] args) {
	    int[] A={10,1,3,4,5,9,8,2,1,7};
        InsertionSorter.InsertionSort(A);
        for(int i:A){
            System.out.print(i+" ");
        }

    }
}
