import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03962 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        Set<Integer> uniqueElements = new HashSet<>();
        Arrays.stream(input).mapToInt(Integer::parseInt).forEach(uniqueElements::add);

        System.out.println(uniqueElements.size() - 100);
        scanner.close();
    }
}