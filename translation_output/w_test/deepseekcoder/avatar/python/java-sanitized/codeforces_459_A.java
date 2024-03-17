import java.util.Scanner;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int l = Math.abs(a - c);
        int m = Math.abs(b - d);
        if (a == c) {
            System.out.println(a + m + " " + b + " " + (c + m) + " " + d);
        } else if (b == d) {
            System.out.println(a + " " + (b + l) + " " + c + " " + (d + l));
        } else if (l != m) {
            System.out.println(-1);
        } else {
            System.out.println(a + " " + d + " " + c + " " + b);
        }
    }
}