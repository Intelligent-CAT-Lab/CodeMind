import java.util.Scanner;

public class p03817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int ans = 0;
        int[] divisionResults = divideBy11(x);
        int q = divisionResults[0];
        int r = divisionResults[1];
        ans += 2 * q;

        divisionResults = divideBy6(r);
        q = divisionResults[0];
        r = divisionResults[1];
        ans += q;

        if (r > 0) {
            ans += 1;
        }

        System.out.println(ans);
    }

    private static int[] divideBy11(int x) {
        int q = x / 11;
        int r = x % 11;
        return new int[]{q, r};
    }

    private static int[] divideBy6(int x) {
        int q = x / 6;
        int r = x % 6;
        return new int[]{q, r};
    }
}