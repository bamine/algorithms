package sorting;

/**
 * Created by amine on 23/08/14.
 * Examples from the book Introduction to Algorithms 3rd edition
 */
public class BinarySearcher {
    public static int search(int a,int[] sortedArray){
        return binarySearch(a,sortedArray,0,sortedArray.length);
    }
    private static int binarySearch(int a,int[] sortedArray,int start,int stop){
        if(start>stop){
            System.out.println("Didn't find it");
            return -1;
        }
        int middle=start+(stop-start)/2;
        if(a<sortedArray[middle]){
            return binarySearch(a, sortedArray, start, middle - 1);
        }
        else if(a>sortedArray[middle]){
            return binarySearch(a,sortedArray,middle+1,stop);
        }
        else{
            System.out.println("Found it at "+middle+"!");
            return middle;
        }
    }
}
