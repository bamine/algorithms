package randomized;

/**
 * Created with IntelliJ IDEA.
 * User: Amine
 * Date: 27/08/14
 * Time: 11:28
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        int[] A={1,2,3,4,5,6,7,8,9};
        ArrayRandomizer.permuteBySorting(A);
        printList(A);
        int[] B={1,2,3,4,5,6,7,8,9};
        ArrayRandomizer.randomizeInPlace(B);
        printList(B);
    }

    private static void printList(int[] a) {
        for(int i: a){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
}
