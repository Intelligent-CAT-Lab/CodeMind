import java.util.Scanner;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
        while (true) {
            if (i + 1 > m) {
                int ans = m;
                break;
            }
            m -= i + 1;
            i += 1;
            i %= n;
        }
        System.out.println(ans);
    }
}