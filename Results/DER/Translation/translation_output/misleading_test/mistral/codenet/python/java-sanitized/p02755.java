import java.util.Scanner;

public class p02755 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int n = A * 100;
        int m = (A + 1) * 100;
        for (int i = n; i <= m; i++) {
            if (i % 8 == A && i / 10 == B) {
                System.out.println(i);
                break;
            }
        }
    }
}