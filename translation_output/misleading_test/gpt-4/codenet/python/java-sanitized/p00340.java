import java.util.Arrays;
import java.util.Scanner;

public class p00340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];

        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(nums);
        if (nums[0] == nums[1] && nums[2] == nums[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}