import java.util.Scanner;

public class p01938 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            int Next = alpha.indexOf(s);
            if (Now < Next) {
                continue;
            } else {
                ans++;
            }
            Now = Next;
        }
        System.out.println(ans);
    }
}