import java.util.stream.IntStream;

public class p00993 {
    public static void main(String[] args) {
        long product = IntStream.range(1, 1501)
                .reduce(1, (a, b) -> a * b);
        System.out.println(product + 2);

        int n = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}