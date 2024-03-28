import java.util.Scanner;

public class p03292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = Math.abs(a - b) + Math.abs(a - c);
        int e = Math.abs(a - b) + Math.abs(b - c);
        int f = Math.abs(a - c) + Math.abs(b - c);

        System.out.println(Math.min(Math.min(d, e), f));
    }
}