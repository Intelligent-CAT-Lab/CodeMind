import java.util.stream.IntStream;

public class p00993 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 1500).reduce(1, (a, b) -> a * b) + 2);
        IntStream.rangeClosed(1, Integer.parseInt(System.console().readLine())).forEach(i -> System.out.println(i + 1));
    }
}