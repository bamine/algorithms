package randomized;

import java.util.ArrayList;

/**
 * Created by amine on 23/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class Main {
    public static void main(String[] args){
        int[] A={1,2,3,4,5,6,7,8,9};
        ArrayRandomizer.permuteBySorting(A);
        printList(A);

        int[] B={1,2,3,4,5,6,7,8,9};
        ArrayRandomizer.randomizeInPlace(B);
        printList(B);

        int[] C={1,2,3,4,5,6,7,8,9};
        C=ArrayRandomizer.permuteByCyclic(C);
        printList(C);

        int m=10;
        int n=100;
        ArrayList<Integer> S=ArrayRandomizer.randomSample(m,n);
        printList(S.toArray(new Integer[10]));
    }

    private static void printList(Integer[] a) {
        for(int i: a){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }

    private static void printList(int[] a) {
        for(int i: a){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
}
