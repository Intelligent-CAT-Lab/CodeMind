import java.util.Scanner;

public class p03920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int w = 0;
        for (int i = 1; i <= 10000000; i++) {
            if (i * (i + 1) / 2 < N && (i + 1) * (i + 2) / 2 <= N) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i >= 1; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}

Sample test case:

4

Expected output:

1
3