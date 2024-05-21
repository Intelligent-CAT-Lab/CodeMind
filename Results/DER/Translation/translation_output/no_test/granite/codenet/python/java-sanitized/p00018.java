import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p00018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] split = input.split(" ");
        List<Integer> integers = Arrays.asList(split).stream()
               .map(Integer::parseInt)
               .sorted(Collections.reverseOrder())
               .toList();

        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }
}