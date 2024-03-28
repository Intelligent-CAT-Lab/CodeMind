import java.util.Scanner;

public class p01938 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int now = 0;
        int ans = 0;
        for (char s : S.toCharArray()) {
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