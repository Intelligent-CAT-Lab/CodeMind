import java.util.Scanner;

public class p03352 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;

        for (int b = 1; b < x; ++b) {
            for (int p = 2; ; ++p) {
                double result = Math.pow(b, p);
                if (result <= x) {
                    ans = Math.max(ans, (int)result);
                } else {
                    break;
                }
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}