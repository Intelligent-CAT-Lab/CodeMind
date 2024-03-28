import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC135_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        int n = s.length;
        int now = 1;
        List<Integer> amari = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            amari.add(now);
            now = (now * 10) % 13;
        }
        int[][] ans = new int[2][13];
        ans[0][0] = 1;
        ans[1][0] = 1;
        for (int i = 0; i < n; i++) {
            now = Integer.parseInt(s[n - 1 - i]);
            ans[(i + 1) % 2] = new int[13];
            if (now == "?") {
                for (int k = 0; k < 10; k++) {
                    int plus = (amari[i] * k) % 13;
                    for (int j = 0; j < 13; j++) {
                        ans[(i + 1) % 2][(j + plus) % 13] += ans[i % 2][j];
                        ans[(i + 1) % 2][(j + plus) % 13] %= 1000000007;
                    }
                }
            } else {
                now = Integer.parseInt(s[n - 1 - i]);
                int plus = (amari[i] * now) % 13;
                for (int j = 0; j < 13; j++) {
                    ans[(i + 1) % 2][(j + plus) % 13] = ans[i % 2][j];
                }
            }
            int last = (i + 1) % 2;
        }
        System.out.println(ans[last][5]);
    }
}