import java.util.Scanner;

public class p01938 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            int Next = alpha.indexOf(S.charAt(i));
            // System.out.println(s, Now, Next);

            if (Now < Next) {
                pass;
            } else {
                ans += 1;
            }
            Now = Next;
        }
        System.out.println(ans);
    }
}