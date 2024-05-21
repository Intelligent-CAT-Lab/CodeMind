import java.util.Scanner;

public class p02952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            String hoge = Integer.toString(i);
            if (hoge.length() % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}