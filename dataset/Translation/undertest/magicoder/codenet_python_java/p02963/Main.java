import java.util.Scanner;

public class p02963 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();

        int X1 = 0;
        int Y1 = 0;

        int tmp = (int) Math.sqrt(S);
        int X2, Y2, X3, Y3;
        if (tmp * tmp >= S) {
            X2 = Y2 = tmp;
        } else {
            X2 = Y2 = tmp + 1;
        }

        int rest = X2 * X2 - S;

        if (rest == 0) {
            X3 = Y3 = 0;
        } else {
            if (rest < 1000000000) {
                X3 = 1;
                Y3 = rest;
            } else {
                for (int i = 2; i <= Math.sqrt(rest) + 1; i++) {
                    if (rest % i == 0) {
                        X3 = i;
                        Y3 = rest / i;
                    }
                }
            }
        }

        System.out.println(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
    }
}