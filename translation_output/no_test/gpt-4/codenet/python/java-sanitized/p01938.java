import java.util.Scanner;

public class p01938 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            int Next = alpha.indexOf(s);
            // System.out.println(s + " " + Now + " " + Next);

            if (Now < Next) {
                // do nothing
            } else {
                ans++;
            }
            Now = Next;
        }
        System.out.println(ans);
    }
}