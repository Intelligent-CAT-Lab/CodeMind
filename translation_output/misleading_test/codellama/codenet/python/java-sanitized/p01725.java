import java.util.Scanner;

public class p01725 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = calculate(input);
        System.out.println(result);
    }

    private static int calculate(String input) {
        int result = 0;
        int cur = 0;
        while (cur < input.length()) {
            char c = input.charAt(cur);
            if (c == '(') {
                cur++; // '('
                result += expr(0);
                cur++; // ')'
            } else if (Character.isDigit(c)) {
                int num = 0;
                while (Character.isDigit(input.charAt(cur))) {
                    num = 10 * num + Character.getNumericValue(input.charAt(cur));
                    cur++;
                }
                result += num;
            } else if (c == '+' || c == '-' || c == '*') {
                cur++;
                result += expr(0);
            }
        }
        return result;
    }

    private static int expr(int level) {
        int result = 0;
        int cur = 0;
        while (cur < input.length()) {
            char c = input.charAt(cur);
            if (level == 2) {
                result += number();
            } else {
                result += expr(level + 1);
            }
            if (c == '+' || c == '-' || c == '*') {
                result += number();
            }
            cur++;
        }
        return result;
    }

    private static int number() {
        int result = 0;
        int cur = 0;
        while (cur < input.length() && Character.isDigit(input.charAt(cur))) {
            result = 10 * result + Character.getNumericValue(input.charAt(cur));
            cur++;
        }
        return result;
    }
}