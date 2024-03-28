import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = Arrays.asList(scanner.nextLine().split("\\s+")).stream().map(Integer::parseInt).toList();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}