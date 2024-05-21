import java.util.*;

public class p01979 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        System.out.println(func(N, 0, 0));
    }

    public static int func(String S, int index, int cnt) {
        int ans = 0;
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            char[] S_ = S.toCharArray();
            for (int i = 0; i < 20; i++) {
                if (S_[i] != '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = (char) ('0' + j);
                    if (Integer.parseInt(String.valueOf(S_).replace('?', '9')) > Integer.parseInt(N)) {
                        break;
                    } else {
                        ans += (int) Math.pow(10, count(S_, '?'));
                    }
                }
                S_[i] = '?';
            }
            ans *= (-1) ** (cnt + 1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            char[] S_ = S.toCharArray();
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            ans += func(String.valueOf(S_), index + 4, cnt + 1);
        }
        return ans;
    }

    public static int count(char[] S, char c) {
        int count = 0;
        for (char s : S) {
            if (s == c) {
                count++;
            }
        }