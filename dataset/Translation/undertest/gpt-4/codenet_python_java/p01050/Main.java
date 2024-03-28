import java.util.Scanner;

public class p01050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split("");
        String abc = "-abcdefghijklmnopqrstuvwxyz-";
        String num = "-0123456789-";
        int[] abc_cnt = new int[28];
        int[] num_cnt = new int[12];

        for (int i = 0; i < s.length; i++) {
            for (int j = 1; j < 27; j++) {
                if (s[i].equals(String.valueOf(abc.charAt(j)))) {
                    abc_cnt[j]++;
                }
            }
        }

        for (int i = 0; i < s.length; i++) {
            for (int j = 1; j < 11; j++) {
                if (s[i].equals(String.valueOf(num.charAt(j)))) {
                    num_cnt[j]++;
                }
            }
        }

        int ans = 0;
        int abc_sum = sum(abc_cnt, 1, 27);
        int num_sum = sum(num_cnt, 1, 11);

        while (abc_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 27) {
                if (abc_cnt[current - 1] == 0 && abc_cnt[current] > 0) {
                    start = Math.min(start, current);
                }

                if (current < 26 && abc_cnt[current + 1] == 0 && abc_cnt[current] > 0) {
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

                if (current < 10 && num_cnt[current + 1] == 0 && num_cnt[current] > 0) {
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

    public static int sum(int[] array, int start, int end) {
        int total = 0;
        for (int i = start; i < end; i++) {
            total += array[i];
        }
        return total;
    }
}