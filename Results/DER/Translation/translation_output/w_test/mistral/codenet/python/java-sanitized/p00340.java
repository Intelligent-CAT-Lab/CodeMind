import java.util.*;

public class p00340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split(" ");
        Arrays.sort(nums);
        if (nums[0].equals(nums[1]) && nums[2].equals(nums[3])) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}