import java.util.Scanner;

public class p01938 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            int Next = alpha.indexOf(S.charAt(i));
            // System.out.println(S.charAt(i) + " " + Now + " " + Next);

            if (Now < Next) {
                ans++;
            }
            Now = Next;
        }
        System.out.println(ans);
    }
}