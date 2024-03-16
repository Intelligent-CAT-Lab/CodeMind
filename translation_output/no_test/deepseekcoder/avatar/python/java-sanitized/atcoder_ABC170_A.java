import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = Arrays.asList(Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new));
        for (int e = 0; e < a.size(); e++) {
            if (a.get(e) == 0) {
                System.out.println(e + 1);
                break;
            }
        }
    }
}