package divideAndConquer;

import java.util.HashMap;

/**
 * Created by amine on 25/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class Main {
    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        HashMap<String, Integer> maxSubarray = MaximumSumSubarray.find(A, 0, A.length - 1);
        for (Object x : maxSubarray.keySet()) {
            System.out.println(x + " -> " + maxSubarray.get(x));
        }

    }
}
