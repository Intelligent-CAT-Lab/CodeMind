import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        System.out.println(Math.max((int)(n.charAt(0) - '0') - 1 + 9 * (n.length() - 1), sumOfDigits(n)));
        scanner.close();
    }

    private static int sumOfDigits(String n) {
        int sum = 0;
        for (char digit : n.toCharArray()) {
            sum += digit - '0';
        }
        return sum;
    }
}