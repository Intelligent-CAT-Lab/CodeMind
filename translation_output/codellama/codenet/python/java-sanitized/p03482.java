import java.util.Scanner;

public class p03482 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();
        int N = S.length();
        int ans = N;
        int ans2 = N;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                ans = Math.min(ans, Math.max(N - i - 1, i));
            } else {
                ans2 = Math.min(ans2, Math.max(N - i - 1, i));
            }
        }
        System.out.println(Math.max(ans, ans2));
    }
}</s>