import java.util.Scanner;

public class p03352 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;
        for (int b = 2; b <= x; b++) {
            for (int p = 2; p <= x; p++) {
                if (b**p <= x) {
                    ans = Math.max(ans, b**p);
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}