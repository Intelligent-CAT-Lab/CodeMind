import java.util.Scanner;

public class p01050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String abc = "-abcdefghijklmnopqrstuvwxyz-";
        String num = "-0123456789-";
        int[] abc_cnt = new int[28];
        int[] num_cnt = new int[12];

        // Count the occurrences of letters
        for (int i = 0; i < s.length(); i++) {
            int index = abc.indexOf(s.charAt(i));
            if(index > 0) {
                abc_cnt[index]++;
            }
        }

        // Count the occurrences of digits
        for (int i = 0; i < s.length(); i++) {
            int index = num.indexOf(s.charAt(i));
            if(index > 0) {
                num_cnt[index]++;
            }
        }

        int ans = 0;
        int abc_sum = sumArray(abc_cnt);
        int num_sum = sumArray(num_cnt);

        // Process letters
        while (abc_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 27) {
                if (abc_cnt[current - 1] == 0 && abc_cnt[current] > 0) {
                    start = Math.min(start, current);
                }

                if (current + 1 < abc_cnt.length && abc_cnt[current + 1] == 0 && abc_cnt[current] > 0) {
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

        // Process digits
        while (num_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 11) {
                if (num_cnt[current - 1] == 0 && num_cnt[current] > 0) {
                    start = Math.min(start, current);
                }

                if (current + 1 < num_cnt.length && num_cnt[current + 1] == 0 && num_cnt[current] > 0) {
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
        sc.close();
    }

    private static int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}