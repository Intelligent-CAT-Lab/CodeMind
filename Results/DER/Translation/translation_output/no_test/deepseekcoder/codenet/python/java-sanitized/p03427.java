import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int maxValue = Math.max(Integer.parseInt(String.valueOf(n.charAt(0))) - 1 + 9 * (n.length() - 1), sumOfDigits(n));
        System.out.println(maxValue);
    }

    private static int sumOfDigits(String n) {
        int sum = 0;
        for (char c : n.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}