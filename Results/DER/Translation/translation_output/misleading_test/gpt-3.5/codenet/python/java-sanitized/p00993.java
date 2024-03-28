import java.util.stream.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


public class p00993 {
    public static void main(String[] args) {
        long product = LongStream.rangeClosed(1, 1500).reduce(1, (x, y) -> x * y);
        long result = product + 2;
        System.out.println(result);
        
        int n = 2; // Replace 2 with your desired input
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}