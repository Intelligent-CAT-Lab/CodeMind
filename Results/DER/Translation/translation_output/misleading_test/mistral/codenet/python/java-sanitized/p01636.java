import java.util.Scanner;

public class p01636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = 0;
        for (int i = 1; i < a; i++) {
            String df = String.valueOf(a);
            String sm = String.valueOf(a - i);
            if (sm.charAt(0) == '0') {
                continue;
            }
            int dfInt = Integer.parseInt(df);
            int smInt = Integer.parseInt(sm);
            if ((dfInt + smInt) % 2 == 0 && smInt >= dfInt && (smInt - dfInt) % 2 == 0) {
                ans++;
            }
            if (a % 2 == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}