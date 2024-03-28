import java.util.Scanner;

public class p01938 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int now = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            int next = alpha.indexOf(s);
            if (now < next) {
                now = next;
            } else {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}