import java.util.*;
import java.io.*;

public class p01979 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] S = new int[20];
        int ans = 0;
        for (int i = 0; i < 20; i++) {
            S[i] = -1;
        }
        ans += func(S, 0, 0);
        System.out.println(ans);
    }

    public static int func(int[] S, int index, int cnt) {
        int ans = 0;
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            for (int i = 0; i < 20; i++) {
                if (S[i]!= -1) {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S[i] = j;
                    if (Integer.parseInt(String.valueOf(S).replace("-1", "9")) > N) {
                        break;
                    } else {
                        ans += Math.pow(10, String.valueOf(S).replace("-1", "").length());
                    }
                }
            }
            ans *= Math.pow(-1, cnt + 1);
            return ans;
        }
        ans += func(S, index + 1, cnt);
        if (index <= 16) {
            S[index] = 5;
            S[index + 1] = 1;
            S[index + 3] = 3;
            ans += func(S, index + 4, cnt + 1);
        }
        return ans;
    }
}