import java.util.Scanner;

public class p02741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {0, 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();
        System.out.println(nums[index]);
    }
}