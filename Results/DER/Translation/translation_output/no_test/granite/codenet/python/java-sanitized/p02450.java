import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class p02450 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        IntStream.rangeClosed(1, n)
               .boxed()
               .permutations()
               .map(Arrays::toString)
               .forEach(System.out::println);
    }
}