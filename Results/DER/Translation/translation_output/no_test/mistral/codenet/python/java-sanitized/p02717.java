import java.util.Scanner;

public class p02717 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, Y, Z;
        X = scanner.nextInt();
        Y = scanner.nextInt();
        Z = scanner.nextInt();
        int A = X;
        int B = Y;
        int C = Z;
        B = X;
        C = Y;
        A = Z;
        System.out.println(A, B, C);
    }
}