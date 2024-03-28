import java.util.Scanner;

public class p02775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = new StringBuilder(scanner.next()).reverse().toString();
        int[] nums = new int[n.length() + 1];
        for (int i = 0; i < n.length(); i++) {
            nums[i] = n.charAt(i) - '0';
        }
        int s = 0;
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int k = nums[i] + s;
            if (k < 5 || (k == 5 && nums[i + 1] < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);
    }
}