import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class p02639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> x_list = Arrays.asList(scanner.nextLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        IntStream.range(0, 5).filter(i -> x_list.get(i) == 0).forEach(i -> System.out.println(i + 1));
    }
}