import java.util.Scanner;

public class p01050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] abc = new int[28];
        int[] num = new int[12];
        int abc_sum = 0;
        int num_sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                abc[c - 'a' + 1]++;
                abc_sum++;
            } else if (c >= '0' && c <= '9') {
                num[c - '0' + 1]++;
                num_sum++;
            }
        }
        int ans = 0;
        while (abc_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 27) {
                if (abc[current - 1] == 0 && abc[current] > 0) {
                    start = Math.min(start, current);
                }
                if (abc[current + 1] == 0 && abc[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    abc[current]--;
                    abc_sum--;
                    break;
                }
                if (abc[current] > 0) {
                    abc[current]--;
                    abc_sum--;
                }
                current++;
            }
        }
        while (num_sum > 0) {
            int start = 100;
            int current = 1;
            while (current < 11) {
                if (num[current - 1] == 0 && num[current] > 0) {
                    start = Math.min(start, current);
                }
                if (num[current + 1] == 0 && num[current] > 0) {
                    ans += Math.min(3, current - start + 1);
                    num[current]--;
                    num_sum--;
                    break;
                }
                if (num[current] > 0) {
                    num[current]--;
                    num_sum--;
                }
                current++;
            }
        }
        System.out.println(ans);
    }
}