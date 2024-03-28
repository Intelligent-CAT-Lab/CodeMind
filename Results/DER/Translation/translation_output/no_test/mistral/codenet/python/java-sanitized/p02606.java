import java.util.Scanner;

public class p02606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L, R, d;
        L = sc.nextInt();
        R = sc.nextInt();
        d = sc.nextInt();
        int ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}