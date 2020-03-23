package warmup;
import java.util.Arrays;
import java.util.Random;

/**
 * - no for;
 * - no while;
 * - no streams;
 * - no any iteration approaches;
 * - no google, please
 */
public class SumApp1 {

    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
        // our random data
        //int[] d = new Random().ints(1, 10).limit(10).toArray();
        //System.out.printf("Source array: %s\n", Arrays.toString(d));
        //System.out.printf("Sum: %d\n", sum(d));
    }
}
