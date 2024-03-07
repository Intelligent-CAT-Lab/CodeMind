import java.util.Scanner;

public class p01050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] abc = new char[] {'-', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '-'};
        char[] num = new char[] {'-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-'};
        int[] abc_cnt = new int[28];
        int[] num_cnt = new int[12];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < 27; j++) {
                if (s.charAt(i) == abc[j]) {
                    abc_cnt[j]++;
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < 11; j++) {
                if (s.charAt(i) == num[j]) {
                    num_cnt[j]++;
                }
            }
        }

        int ans = 0;
        int abc_sum = 0;
        int num_sum = 0;

        for (int i = 0; i < 28; i++) {
            abc_sum += abc_cnt[i];
        }

        for (int i = 0; i < 12; i++) {
            num_sum += num_cnt[i];
        }

        while (abc_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 27) {
                if (abc_cnt[current - 1] == 0 && abc_cnt[current] > 0) {
                    start = Math.min(start, current);
                }

                if (abc_cnt[current + 1] == 0 && abc_cnt[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    abc_cnt[current]--;
                    abc_sum--;
                    break;
                }

                if (abc_cnt[current] > 0) {
                    abc_cnt[current]--;
                    abc_sum--;
                }

                current++;
            }
        }

        while (num_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 11) {
                if (num_cnt[current - 1] == 0 && num_cnt[current] > 0) {
                    start = Math.min(start, current);
                }

                if (num_cnt[current + 1] == 0 && num_cnt[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    num_cnt[current]--;
                    num_sum--;
                    break;
                }

                if (num_cnt[current] > 0) {
                    num_cnt[current]--;
                    num_sum--;
                }

                current++;
            }
        }

        System.out.println(ans);
    }
}