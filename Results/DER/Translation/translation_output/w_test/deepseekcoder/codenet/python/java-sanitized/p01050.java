import java.util.*;

public class p01050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] abc_cnt = new int[28];
        int[] num_cnt = new int[12];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                abc_cnt[c - 'a' + 1]++;
            } else if (Character.isDigit(c)) {
                num_cnt[c - '0' + 1]++;
            }
        }
        int ans = 0;
        int abc_sum = Arrays.stream(abc_cnt).sum();
        int num_sum = Arrays.stream(num_cnt).sum();
        while (abc_sum > 0) {
            int start = 100;
            for (int current = 1; current < 27; current++) {
                if (abc_cnt[current] > 0) {
                    if (abc_cnt[current - 1] == 0) {
                        start = Math.min(start, current);
                    }
                    if (abc_cnt[current + 1] == 0) {
                        ans += Math.min(3, current - start + 1);
                        abc_cnt[current]--;
                        abc_sum--;
                        break;
                    }
                    abc_cnt[current]--;
                    abc_sum--;
                }
            }
        }
        while (num_sum > 0) {
            int start = 100;
            for (int current = 1; current < 11; current++) {
                if (num_cnt[current] > 0) {
                    if (num_cnt[current - 1] == 0) {
                        start = Math.min(start, current);
                    }
                    if (num_cnt[current + 1] == 0) {
                        ans += Math.min(3, current - start + 1);
                        num_cnt[current]--;
                        num_sum--;
                        break;
                    }
                    num_cnt[current]--;
                    num_sum--;
                }
            }
        }
        System.out.println(ans);
    }
}