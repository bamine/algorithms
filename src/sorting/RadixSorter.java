package sorting;

import static java.lang.Math.pow;

/**
 * Created with IntelliJ IDEA.
 * User: Amine
 * Date: 05/09/14
 * Time: 14:28
 * To change this template use File | Settings | File Templates.
 */
public class RadixSorter {
    public static int[] sort(int[] A,int d){
        int[] B=A.clone();
          for(int i=0;i<d;i++){
              B=sortOnDigits(B,i,10);
          }
        return B;
    }
    public static int getDigit(int a,int i){
        return (a/(int)pow(10,i))%10;
    }
    public static int[] sortOnDigits(int[] A,int d,int k){
        int[] C=new int[k+1];
        int[] B=new int[A.length];
        int tempDigit;
        for(int i=0;i<=k;i++){
            C[i]=0;
        }
        for(int j=0;j<A.length;j++){
            tempDigit=getDigit(A[j],d);
            C[tempDigit]=C[tempDigit]+1;
        }
        for(int i=1;i<=k;i++){
            C[i]+=C[i-1];
        }
        for(int j=A.length-1;j>=0;j--){
            tempDigit=getDigit(A[j],d);
            B[C[tempDigit]-1]=A[j];
            C[tempDigit]-=1;
        }
        return B;
    }
}
