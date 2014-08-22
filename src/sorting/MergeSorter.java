package sorting;

/**
 * Created by amine on 22/08/14.
 */
public class MergeSorter {
    public static void sort(int[] A,int p,int r){
        if(p<r){
            int q=(p+r)/2;
            sort(A,p,q);
            sort(A,q+1,r);
            merge(A,p,q,r);
        }
    }
    public static void merge(int[] A, int p, int q, int r){
        int n1=q-p+1;
        int n2=r-q;
        int[] L=new int[n1+1];
        int[] R=new int[n2+1];
        int i;
        int j;
        for(i=0;i<n1;i++){
            L[i]=A[p+i-1];
        }
        for(j=0;j<n2;j++){
            R[j]=A[q+j];
        }
        L[n1]=Integer.MAX_VALUE;
        R[n2]=Integer.MAX_VALUE;
        i=0;
        j=0;
        for(int k=p-1;k<r;k++){
            if(L[i]<=R[j]){
                A[k]=L[i];
                i++;
            }
            else{
                A[k]=R[j];
                j++;
            }
        }



    }

}
