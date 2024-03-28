import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = max(n);
        System.out.println(result);
    }

    public static int max(int n) {
        int firstDigit = Character.getNumericValue(n);
        int length = String.valueOf(n).length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += Character.getNumericValue(n);
        }
        return Math.max(firstDigit - 1 + 9 * (length - 1), sum);
    }
}