import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02596 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            long tmp = k * 7L;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().allMatch(ch -> ch == '7')) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                long num = tmp / 10 % 10 <= 7 ? 7 - tmp / 10 % 10 : (tmp / 10 % 10 == 8 ? 9 : 8);
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 3) {
            long tmp = k * 9L;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().allMatch(ch -> ch == '7')) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                long num = (((tmp / 10 % 10) * 3) - 1) % 10;
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 7) {
            long tmp = k;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().allMatch(ch -> ch == '7')) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                long num = (((tmp / 10 % 10) * 7) + 1) % 10;
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 9) {
            long tmp = k * 3L;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().allMatch(ch -> ch == '7')) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                long num = (((tmp / 10 % 10) + 3) % 10);
                long tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}