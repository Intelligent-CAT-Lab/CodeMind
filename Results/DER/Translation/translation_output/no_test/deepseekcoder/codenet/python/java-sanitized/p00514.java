import java.util.Arrays;
import java.util.Scanner;

public class p00514 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = input[0], m = input[1], r = input[2];
        int[] ab = {n - 1, r - m * n};
        Arrays.sort(ab);
        int a = ab[0], b = ab[1];
        long d = 1, u = 1;
        if (a > 0) {
            for (int i = 0; i < a; i++) {
                d *= i + 1;
            }
            for (int i = b; i < a + b; i++) {
                u *= i + 1;
            }
        }
        System.out.println(a < 1 ? 0 : u / d);
    }
}