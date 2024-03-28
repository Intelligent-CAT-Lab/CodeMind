import java.util.Scanner;

public class p02554 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        long ant = 1, bnt = 1, cnt = 1;
        long modulo = 1000000007;

        for (int i = 0; i < n; i++) {
            ant = (10 * ant) % modulo;
            bnt = (9 * bnt) % modulo;
            cnt = (8 * cnt) % modulo;
        }

        long ans = (ant - (bnt * 2 - cnt)) % modulo;

        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(modulo + ans);
        }
    }
}