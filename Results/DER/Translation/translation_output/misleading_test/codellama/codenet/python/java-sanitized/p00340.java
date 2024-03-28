import java.util.Scanner;

public class p00340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] nums = input.split(" ");
        int[] num = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(num);
        if (num[0] == num[1] && num[2] == num[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}