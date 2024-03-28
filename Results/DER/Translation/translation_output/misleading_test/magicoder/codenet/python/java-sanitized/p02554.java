import java.util.Scanner;

public class p02554 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long ant = 1, bnt = 1, cnt = 1;

        for (int i = 0; i < n; i++) {
            ant = (10 * ant) % 1000000007;
            bnt = (9 * bnt) % 1000000007;
            cnt = (8 * cnt) % 1000000007;
        }

        long ans = (ant - (2 * bnt - cnt)) % 1000000007;

        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(1000000007 + ans);
        }
    }
}