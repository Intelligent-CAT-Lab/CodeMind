import java.util.Scanner;

public class p03429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (n * m < 2 * (a + b)) {
            System.out.println("NO");
            return;
        }

        if (n == 1 || m == 1) {
            if (n == 1 && m == 1) {
                if (a == 0 && b == 0) {
                    System.out.println("YES");
                    System.out.println(".");
                } else {
                    System.out.println("NO");
                    return;
                }
            } else if (n == 1) {
                if (b >= 1) {
                    System.out.println("NO");
                    return;
                } else {
                    if (m / 2 < a) {
                        System.