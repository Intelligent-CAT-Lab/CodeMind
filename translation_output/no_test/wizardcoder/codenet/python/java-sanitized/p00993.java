import java.util.stream.IntStream;

public class p00993 {
    public static void main(String[] args) {
        int result = IntStream.rangeClosed(1, 1500)
               .reduce(1, (x, y) -> x * y);
        System.out.println(result + 2);

        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}