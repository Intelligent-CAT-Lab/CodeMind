import java.util.Scanner;
import java.util.Deque;
import java.util.Arrays;
import java.util.stream.IntStream;

public class p01979 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[20];
        Arrays.fill(S, -1);
        int ans = func(S, 0, 0);
        System.out.println(ans);
    }

    private static int func(int[] S, int index, int cnt) {
        if (index == 20) {
            if (cnt == 0) {
                return 0;
            }
            int[] S_ = Arrays.copyOf(S, 20);
            for (int i = 0; i < 20; i++) {
                if (S_[i] != -1) {
                    continue;
                }
                for (int j = 0; j < 10; j++) {
                    S_[i] = j;
                    if (Integer.parseInt(Arrays.toString(S_).replace("?", "9")) > N) {
                        break;
                    } else {
                        ans += 10 * S_.count("?");
                    }
                }
            }
            ans *= (-1) ** (cnt + 1);
            return ans;
        }
        int ans = func(S, index + 1, cnt);
        if (index <= 16) {
            int[] S_ = Arrays.copyOf(S, 20);
            S_[index] = 5;
            S_[index + 1] = 1;
            S_[index + 3] = 3;
            ans += func(S_, index + 4, cnt + 1);
        }
        return ans;
    }
}