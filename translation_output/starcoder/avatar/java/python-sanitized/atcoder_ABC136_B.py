import java.util.*;

public class atcoder_ABC136_B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int count = 0;
        int temp = N;
        int ans = 0;

        while (temp > 0) {
            temp /= 10;
            count++;
        }

        for (int i = 1; i <= count; i++) {
            if (i == count) {
                if (i % 2 == 1) {
                    ans += (N - pow(10, i - 1) + 1);
                }
            } else {
                if (i == 1) {
                    ans += 9;
                } else if (i % 2 == 1) {
                    ans += (pow(10, i) - pow(10, i - 1));
                }
            }
        }

        System.out.println(ans);
    }
}