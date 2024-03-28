import java.util.Scanner;

public class p01938 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int now = 0;
        int ans = 0;

        for (char s : S.toCharArray()) {
            int next = alpha.indexOf(s);

            if (now < next) {
                // do nothing
            } else {
                ans++;
            }

            now = next;
        }

        System.out.println(ans);
    }
}