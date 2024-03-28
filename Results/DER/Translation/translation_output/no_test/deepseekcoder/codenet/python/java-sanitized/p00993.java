import java.util.stream.IntStream;

public class p00993 {
    public static void main(String[] args) {
        long product = IntStream.rangeClosed(1, 1500)
                               .reduce(1, (x, y) -> x * y);
        System.out.println(product + 2);

        int n = Integer.parseInt(System.console().readLine());
        IntStream.rangeClosed(1, n)
                 .forEach(i -> System.out.println(i + 1));
    }
}