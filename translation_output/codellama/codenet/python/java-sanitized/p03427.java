import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int maxValue = Math.max(Integer.parseInt(n.charAt(0)) - 1 + 9 * (n.length() - 1), sum(n));
        System.out.println(maxValue);
    }

    private static int sum(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(n.charAt(i));
        }
        return sum;
    }
}