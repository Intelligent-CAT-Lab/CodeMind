import java.util.stream.IntStream;
import java.util.function.BinaryOperator;

public class p00993 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 1501).reduce(1, (x, y) -> x * y) + 2);
        int n = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        IntStream.range(1, n + 1).forEach(i -> System.out.println(i + 1));
    }
}