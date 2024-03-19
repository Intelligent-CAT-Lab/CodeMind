import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int max = Math.max(calculateFirst(n) + 9 * (n.length() - 1), calculateSum(n));
        System.out.println(max);
    }

    private static int calculateFirst(String n) {
        return Integer.parseInt(n.substring(0, 1)) - 1;
    }

    private static int calculateSum(String n) {
        int sum = 0;
        for (char c : n.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}