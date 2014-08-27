package sorting;

/**
 * Created by amine on 22/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class InsertionSorter {
    public static void sort(int[] A){
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

    public static void sortRecursive(int[] A,int last){
        if(last>0) {
            sortRecursive(A, last - 1);
            int pos = last - 1;
            while (pos >= 0 && A[last] <= A[pos]) {
                pos--;
            }
            pos++;
            int temp = A[last];
            for (int i = last - 1; i >= pos; i--) {
                A[i + 1] = A[i];
            }
            A[pos] = temp;
        }
    }

    public static void sortReverse(int[] A){
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
