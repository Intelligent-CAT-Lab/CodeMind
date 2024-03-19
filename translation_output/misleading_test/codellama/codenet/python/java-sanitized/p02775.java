import java.util.Scanner;

public class p02775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int res = 0;
        int s = 0;
        for (int i = 0; i < n - 1; i++) {
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