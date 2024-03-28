import java.util.Scanner;

public class p03351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println((Math.abs(a - c) <= d || Math.abs(a - b) <= d && Math.abs(b - c) <= d) ? "No" : "Yes");
    }
}