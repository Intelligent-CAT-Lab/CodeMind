import java.util.Scanner;

public class p02963 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        scanner.close();

        int X1 = 0;
        int Y1 = 0;

        int tmp = (int)Math.sqrt(S);
        int X2, Y3;
        if (tmp * tmp >= S) {
            X2 = Y3 = tmp;
        } else {
            X2 = Y3 = tmp + 1;
        }

        int rest = X2 * X2 - S;
        int X3, Y2;
        if (rest == 0) {
            X3 = Y2 = 0;
        } else {
            if (rest < 1000000000) {
                X3 = 1;
                Y2 = rest;
            } else {
                X3 = Y2 = 0;
                for (int i = 2; i <= (int)Math.sqrt(rest) + 1; i++) {
                    if (rest % i == 0) {
                        X3 = i;
                        Y2 = rest / i;
                        break;
                    }
                }
            }
        }

        System.out.print(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
    }
}