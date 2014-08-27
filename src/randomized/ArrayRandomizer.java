package randomized;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Amine
 * Date: 27/08/14
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */
public class ArrayRandomizer {
    public static void permuteBySorting(int[] A){
        Random rnd=new Random();
        int n=A.length;
        int[] P=new int[n];
        for(int i=0;i<n;i++){
            P[i]=rnd.nextInt(n*n*n);
        }
        sortUsingArray(A,P);
    }

    public static void randomizeInPlace(int[] A){
        Random rnd=new Random();
        int n=A.length;
        int temp;
        int j;
        for(int i=0;i<n;i++){
            j=i+rnd.nextInt(n-i);
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
    }

    private static void sortUsingArray(int[] a, int[] p) {
        int key;
        int key2;
        int i;
        for(int j=1;j<p.length;j++){
            key=p[j];
            key2=a[j];
            i=j-1;
            while(i>=0 && p[i]>key){
                a[i+1]=a[i];
                i--;
            }
            p[i+1]=key;
            a[i+1]=key2;
        }
    }
}
