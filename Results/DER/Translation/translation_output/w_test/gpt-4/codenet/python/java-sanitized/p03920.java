import java.util.Scanner;

public class p03920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int w = 0;

        // Find w such that w(w + 1)/2 < N <= (w + 1)(w + 2)/2
        for (int i = 0; i < 100000; i++) { // 10 ** 5 is written as 100000 in Java
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }

        // Print and subtract values from N, starting from w down to 1
        for (int i = w; i > 0; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }

        scanner.close();
    }
}