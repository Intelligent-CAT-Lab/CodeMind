import java.util.Scanner;

public class p03896 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n - 2; i++) {
            System.out.print((n < 3) ? " " : "(" + (i - (~(Math.pow(i, n % 2) < (i + 2) % n * 2))) % n + 1 + ")");
        }
    }
}