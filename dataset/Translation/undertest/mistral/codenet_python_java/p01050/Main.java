import java.util.*;

public class p01050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String abc = "-abcdefghijklmnopqrstuvwxyz-";
        String num = "-0123456789-";
        int[] abc_cnt = new int[26];
        int[] num_cnt = new int[10];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < abc.length(); j++) {
                if (s.charAt(i) == abc.charAt(j)) {
                    abc_cnt[j]++;
                }
            }
            for (int j = 0; j < num.length(); j++) {
                if (s.charAt(i) == num.charAt(j)) {
                    num_cnt[j]++;
                }
            }
        }
        int ans = 0;
        int abc_sum = 0;
        int num_sum = 0;

        while (abc_sum > 0) {
            int start = 100;
            int current = 0;
            while (current < 26) {
                if (abc_cnt[current] == 0 && abc_cnt[current + 1] > 0) {
                    start = Math.min(start, current + 1);
                }
                if (abc_cnt[current + 2] == 0 && abc_cnt[current + 1] > 0) {
                    ans += Math.min(3, current - start + 1);
                    abc_cnt[current + 1]--;
                    abc_sum--;
                    break;
                }
                if (abc_cnt[current + 1] > 0) {
                    abc_cnt[current + 1]--;
                    abc_sum--;
                }
                current++;
            }
        }
        while (num_sum > 0) {
            int start = 100;
            int current = 0;
            while (current < 10) {
                if (num_cnt[current] == 0 && num_cnt[current + 1] > 0) {
                    start = Math.min(start, current + 1);
                }
                if (num_cnt[current + 2] == 0 && num_cnt[current + 1] > 0) {
                    ans += Math.min(3, current - start + 1);
                    num_cnt[current + 1]--;
                    num_sum--;
                    break;
                }
                if (num_cnt[current + 1] > 0) {
                    num_cnt[current + 1]--;
                    num_sum--;
                }
                current++;
            }
        }
        System.out.println(ans);
    }
}