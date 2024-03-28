import java.util.*;

public class p01979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = "5124";
        int ans = func(S, 0, 0, N);
        System.out.println(ans);
    }

    public static int func(String S, int index, int cnt, int N) {
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            int ans = 0;
            for (int i = 0; i < 20; i++) {
                if (S.charAt(i)!= '?') {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    char[] S_ = S.toCharArray();
                    S_[i] = (char) (j + '0');
                    if (Integer.parseInt(new String(S_).replace("?", "9")) > N) {
                        break;
                    } else {
                        ans += Math.pow(10, S_.length - S_.replace("?", "").length);
                    }
                }
            }
            ans *= Math.pow(-1, cnt + 1);
            return (int) ans;
        }
        int ans = func(S, index + 1, cnt, N);
        if (index <= 16) {
            char[] S_ = S.toCharArray();
            S_[index] = '5';
            S_[index + 1] = '1';
            S_[index + 3] = '3';
            ans += func(new String(S_), index + 4, cnt + 1, N);
        }
        return ans;
    }
}