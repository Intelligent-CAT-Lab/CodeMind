import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int sum = 0;
        for (char c : n.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        int result = Math.max(Character.getNumericValue(n.charAt(0)) - 1 + 9 * (n.length() - 1), sum);
        System.out.println(result);
    }
}