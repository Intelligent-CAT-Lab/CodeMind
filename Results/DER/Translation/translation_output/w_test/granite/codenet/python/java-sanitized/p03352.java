import java.util.Scanner;

public class p03352 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;
        for (int b = 1; b <= x; b++) {
            for (int p = 2; b * Math.pow(b, p) <= x; p++) {
                ans = Math.max(ans, (int) Math.pow(b, p));
            }
        }
        System.out.println(ans);
    }
}