import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        int result = Math.max(Integer.parseInt(String.valueOf(n.charAt(0))) - 1 + 9 * (n.length() - 1), sum);
        System.out.println(result);
    }
}