import java.util.stream.IntStream;

public class p00993 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 1500).reduce(1, (x, y) -> x * y) + 2);
        int n = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}