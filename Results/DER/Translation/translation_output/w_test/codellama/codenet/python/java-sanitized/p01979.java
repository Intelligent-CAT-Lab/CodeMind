import java.util.Scanner;

public class p01979 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = func(N, 0, 0);
        System.out.println(ans);
    }

    private static int func(int N, int index, int cnt) {
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            String S = String.valueOf(N);
            for (int i = 0; i < 20; i++) {
                if (S.charAt(i) != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S = S.substring(0, i) + j + S.substring(i + 1);
                    if (Integer.parseInt(S.replace("?", "9")) > N) {
                        break;
                    } else {
                        ans += Math.pow(10, S.length() - S.replace("?", "").length());
                    }
                }
            }
            ans *= (-1) ** (cnt + 1);
            return ans;
        }
        ans += func(N, index + 1, cnt);
        if (index <= 16) {
            String S = String.valueOf(N);
            S = S.substring(0, index) + "5" + S.substring(index + 1);
            S = S.substring(0, index + 1) + "1" + S.substring(index + 3);
            S = S.substring(0, index + 3) + "3" + S.substring(index + 4);
            ans += func(Integer.parseInt(S), index + 4, cnt + 1);
        }
        return ans;
    }
}