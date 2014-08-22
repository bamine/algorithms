package sorting;

/**
 * Created with IntelliJ IDEA.
 * User: Amine
 * Date: 22/08/14
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
public class SelectionSorter {
    public static void sort(int[] A){
        int i,j;
        int iMin;
        int n=A.length;
        int temp;
        for (j = 0; j < n-1; j++) {
            iMin = j;
            for ( i = j+1; i < n; i++) {
                if (A[i] < A[iMin]) {
                    iMin = i;
                }
            }
            if(iMin != j) {
                temp=A[j];
                A[j]=A[iMin];
                A[iMin]=temp;
            }
        }
    }
}
