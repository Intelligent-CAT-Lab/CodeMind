import java.util.*;

public class p02946 {
    static final int DVSR = 1000000007;
    static final int INTMAX = 9223372036854775807;
    static final int INTMIN = -9223372036854775808;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();

        for (int i = Math.max(X - K + 1, -1000000); i <= Math.min(X + K, 1000000); i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}