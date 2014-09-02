package sorting;

/**
 * Created by amine on 02/09/2014.
 */
public class CountingSorter {
    public static int[] sort(int[] A,int k){
        int[] C=new int[k+1];
        int[] B=new int[A.length];
        for(int i=0;i<=k;i++){
            C[i]=0;
        }
        for(int j=0;j<A.length;j++){
            C[A[j]]=C[A[j]]+1;
        }
        for(int i=1;i<=k;i++){
            C[i]+=C[i-1];
        }
        for(int j=A.length-1;j>=0;j--){
            B[C[A[j]]-1]=A[j];
            C[A[j]]-=1;
        }
        return B;
    }
}
