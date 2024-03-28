import java.util.stream.IntStream;

public class p00993 {
    public static void main(String[] args) {
        // Calculate the product of numbers from 1 to 1500 and add 2
        long result = IntStream.rangeClosed(1, 1500)
                .mapToLong(x -> x)
                .reduce((x, y) -> x * y)
                .orElse(1) + 2;
        System.out.println(result);

        // Print numbers from 1 to the input number
        int n = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}