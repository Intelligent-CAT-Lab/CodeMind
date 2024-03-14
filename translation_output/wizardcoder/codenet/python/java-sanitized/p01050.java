import java.util.*;

public class p01050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Character> abc = new ArrayList<>(Arrays.asList('-', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l','m', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z', '-'));
        List<Character> num = new ArrayList<>(Arrays.asList('-', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-'));
        int[] abc_cnt = new int[28];
        int[] num_cnt = new int[12];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (abc.contains(c)) {
                abc_cnt[abc.indexOf(c)]++;
            } else if (num.contains(c)) {
                num_cnt[num.indexOf(c)]++;
            }
        }

        int ans = 0;
        int abc_sum = 0;
        int num_sum = 0;

        for (int i = 0; i < abc_cnt.length; i++) {
            abc_sum += abc_cnt[i];
        }

        for (int i = 0; i < num_cnt.length; i++) {
            num_sum += num_cnt[i];
        }

        while (abc_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 27) {
                if (abc_cnt[current-1] == 0 && abc_cnt[current] > 0) {
                    start = Math.min(start, current);
                }

                if (abc_cnt[current+1] == 0 && abc_cnt[current] > 0) {
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
                if (num_cnt[current-1] == 0 && num_cnt[current] > 0) {
                    start = Math.min(start, current);
                }

                if (num_cnt[current+1] == 0 && num_cnt[current] > 0) {
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