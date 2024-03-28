import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class p02450 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stream<int[]> permutations = IntStream.rangeClosed(1, n).boxed().permutations();
        permutations.forEach(p -> System.out.println(p[0] + " " + p[1]));
    }
}