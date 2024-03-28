import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class p01725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] digits = input.split("");
        int[] pri = new int[3];
        for (int i = 0; i < 3; i++) {
            pri[i] = scanner.nextInt();
        }
        int ans = -1000;
        for (int[] p : Arrays.asList(pri)) {
            int result = 0;
            for (int i = 0; i < digits.length; i++) {
                if (digits[i].equals("(")) {
                    result += expr(p, i + 1);
                } else if (digits[i].equals(")")) {
                    break;
                } else {
                    result += Integer.parseInt(digits[i]);
                }
            }
            ans = Math.max(ans, result);
        }
        System.out.println(ans);
    }

    private static int expr(int[] pri, int i) {
        int result = 0;
        while (i < digits.length) {
            if (digits[i].equals("(")) {
                result += expr(pri, i + 1);
            } else if (digits[i].equals(")")) {
                break;
            } else {
                result += Integer.parseInt(digits[i]);
            }
            i++;
        }
        return result;
    }
}