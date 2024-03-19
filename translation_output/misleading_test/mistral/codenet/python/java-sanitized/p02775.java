import java.util.*;

public class p02775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n + 1];
        Arrays.fill(nums, 0);
        int res = 0;
        for (int i = 0; i < n; i++) {
            nums[n - i] = sc.nextInt();
        }
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