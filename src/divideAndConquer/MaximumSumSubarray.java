package divideAndConquer;

import java.util.HashMap;

/**
 * Created by amine on 23/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class MaximumSumSubarray {
    public static HashMap<String, Integer> find(int[] A, int low, int high) {
        if(high==low){
            HashMap<String,Integer> sa=new HashMap<String, Integer>();
            sa.put("maxLeft",low);
            sa.put("maxRight",high);
            sa.put("sum",A[low]);
            return sa;
        }
        else{
            int mid=(low+high)/2;
            HashMap<String,Integer> leftSubarray=find(A,low,mid);
            HashMap<String,Integer> rightSubarray=find(A,mid+1,high);
            HashMap<String,Integer> crossSubarray=findMaxCrossingSubarray(A,low,mid,high);
            if(leftSubarray.get("sum")>=rightSubarray.get("sum")
                    && leftSubarray.get("sum")>=crossSubarray.get("sum")){
                return leftSubarray;

            }
            else if(rightSubarray.get("sum")>=leftSubarray.get("sum")
                    && rightSubarray.get("sum")>=crossSubarray.get("sum")){
                return rightSubarray;

            }
            else{
                return crossSubarray;
            }
        }
    }

    public static HashMap<String, Integer> findMaxCrossingSubarray(int[] A, int low, int mid, int high) {
        int leftSum=-Integer.MAX_VALUE;
        int sum=0;
        int maxLeft=-1;
        int maxRight=-1;
        for(int i=mid;i>=low;i--){
            sum += A[i];
            if(sum>leftSum){
                leftSum=sum;
                maxLeft=i;
            }
        }

        int rightSum=-Integer.MAX_VALUE;
        sum=0;
        for(int j=mid+1;j<=high;j++){
            sum += A[j];
            if(sum>rightSum){
                rightSum=sum;
                maxRight=j;
            }
        }
        HashMap<String,Integer> maxCrossingSubarray=new HashMap<String, Integer>();
        maxCrossingSubarray.put("maxLeft",maxLeft);
        maxCrossingSubarray.put("maxRight",maxRight);
        maxCrossingSubarray.put("sum",leftSum+rightSum);
        return maxCrossingSubarray;
    }

    public static HashMap<String, Integer> findBruteForce(int[] A) {
        int sum;
        int maxSum = 0;
        int maxLeft = 0;
        int maxRight = 0;
        for (int i = 0; i < A.length - 1; i++) {
            sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum >= maxSum) {
                    maxLeft = i;
                    maxRight = j;
                    maxSum = sum;
                }

            }
        }
        HashMap<String, Integer> maxSubarray = new HashMap<String, Integer>();
        maxSubarray.put("maxLeft", maxLeft);
        maxSubarray.put("maxRight", maxRight);
        maxSubarray.put("sum", maxSum);
        return maxSubarray;
    }
}

