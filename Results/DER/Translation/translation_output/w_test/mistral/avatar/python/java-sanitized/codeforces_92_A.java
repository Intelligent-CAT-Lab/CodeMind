import java.util.Scanner;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int i = 0;
        while (true) {
            if (i + 1 > m) {
                int ans = m;
                break;
            }
            m -= i + 1;
            i++;
            i %= n;
        }
        System.out.println(ans);
    }
}