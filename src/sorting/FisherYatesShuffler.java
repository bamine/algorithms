package sorting;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Amine
 * Date: 22/08/14
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 */
public class FisherYatesShuffler {
    // Implementing Fisher–Yates shuffle
    static void shuffleArray(int[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
