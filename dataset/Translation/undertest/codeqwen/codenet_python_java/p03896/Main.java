import java.util.stream.IntStream;

public class p03896 {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < n - 2 / n; i++) {
            System.out.println(IntStream.range(0, n - 1)
                    .map(j -> (i - ~(j ^ (n % 2 < (j + 2 < n && i * 2 < n) ? 1 : 0))) % n + 1)
                    .mapToObj(String::valueOf)
                    .reduce((a, b) -> a + " " + b)
                    .orElse(""));
        }
    }
}