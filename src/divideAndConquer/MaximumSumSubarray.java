package divideAndConquer;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Amine
 * Date: 25/08/14
 * Time: 16:09
 * To change this template use File | Settings | File Templates.
 */
public class MaximumSumSubarray {
    public HashMap<String,Integer> find(int[] A,int low,int high){
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
    public HashMap<String,Integer> findMaxCrossingSubarray(int[] A,int low,int mid,int high){
        int leftSum=-Integer.MAX_VALUE;
        int sum=0;
        int maxLeft=-1;
        int maxRight=-1;
        for(int i=mid;i>=low;i--){
            sum+=sum+A[i];
            if(sum>leftSum){
                leftSum=sum;
                maxLeft=i;
            }
        }

        int rightSum=-Integer.MAX_VALUE;
        sum=0;
        for(int j=mid+1;j<=high;j++){
            sum+=sum+A[j];
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
}

