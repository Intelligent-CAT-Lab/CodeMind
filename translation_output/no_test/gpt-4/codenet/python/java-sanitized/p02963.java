import java.util.Scanner;

public class p02963 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        scanner.close();

        long X1 = 0;
        long Y1 = 0;
        long X2, Y2, X3, Y3;

        long tmp = (long) Math.sqrt(S);
        if (tmp * tmp >= S) {
            X2 = Y3 = tmp;
        } else {
            X2 = Y3 = tmp + 1;
        }

        long rest = X2 * X2 - S;

        if (rest == 0) {
            X3 = Y2 = 0;
        } else {
            if (rest < 1000000000L) {
                X3 = 1;
                Y2 = rest;
            } else {
                for (long i = 2; i <= (long) Math.sqrt(rest) + 1; i++) {
                    if (rest % i == 0) {
                        X3 = i;
                        Y2 = rest / i;
                        break;
                    }
                }
            }
        }

        System.out.println(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
    }
}