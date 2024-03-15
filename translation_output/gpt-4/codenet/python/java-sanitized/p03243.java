import java.util.Scanner;

public class p03243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = 0, P = 0;

        for (int i = 0; i < 10; i++) {
            P = i * 111;
            if (X < N && N <= P) {
                System.out.println(P);
            }
            X = P;
        }

        scanner.close();
    }
}