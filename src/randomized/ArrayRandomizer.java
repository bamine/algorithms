package randomized;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by amine on 23/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
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

    public static int[] permuteByCyclic(int[] A){
        Random rnd=new Random();
        int n=A.length;
        int[] B=new int[n];
        int offset=rnd.nextInt(n-1);
        int dest;
        for(int i=0;i<n;i++){
            dest=i+offset;
            if(dest>n-1){
                dest=dest-n;
            }
            B[dest]=A[i];
        }
        return B;
    }

    public static ArrayList<Integer> randomSample(int m,int n){
        Random rnd=new Random();
        if(m==0){
            return new ArrayList<Integer>();
        }
        else{
            ArrayList<Integer> S=randomSample(m-1,n-1);
            int i=rnd.nextInt(n);
            if(S.contains(i)){
                S.add(n-1);
            }
            else{
                S.add(i);
            }
            return S;
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
