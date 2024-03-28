import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        int result = Math.max(Integer.parseInt(n.substring(0, 1)) - 1 + 9 * (n.length() - 1), sumOfDigits(n));
        System.out.println(result);
    }

    public static int sumOfDigits(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        return sum;
    }
}