import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class p02639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> xList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i < xList.size(); i++) {
            if (xList.get(i) == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}