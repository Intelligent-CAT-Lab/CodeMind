import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(Math.max(getMaxValue(n), getSumOfDigits(n)));
        sc.close();
    }

    private static int getMaxValue(String n) {
        // Subtract 1 from the first digit and add 9 for each remaining digit
        return (n.charAt(0) - '0' - 1) + 9 * (n.length() - 1);
    }

    private static int getSumOfDigits(String n) {
        // Sum all the digits
        int sum = 0;
        for (char digit : n.toCharArray()) {
            sum += digit - '0';
        }
        return sum;
    }
}