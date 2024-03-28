import java.util.Scanner;

public class p03427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = Math.max(n - 1 + 9 * (n - 1), n);
        System.out.println(result);
    }
}