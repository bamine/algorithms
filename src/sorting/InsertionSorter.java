package sorting;

/**
 * Created by amine on 22/08/14.
 */
public class InsertionSorter {
    public static void InsertionSort(int[] A){
        int key;
        int i;
        for(int j=1;j<A.length;j++){
            key=A[j];
            i=j-1;
            while(i>=0 && A[i]>key){
                A[i+1]=A[i];
                i--;
            }
            A[i+1]=key;
        }
    }

    public static void InsertionSortReverse(int[] A){
        int key;
        int i;
        for(int j=1;j<A.length;j++){
            key=A[j];
            i=j-1;
            while(i>=0 && A[i]<key){
                A[i+1]=A[i];
                i--;
            }
            A[i+1]=key;
        }
    }
}
