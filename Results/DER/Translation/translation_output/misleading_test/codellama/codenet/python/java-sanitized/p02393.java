import java.util.Scanner;

public class p02393 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }
        int[] sortedNums = sort(nums);
        System.out.println(sortedNums[0] + " " + sortedNums[1] + " " + sortedNums[2]);
    }

    public static int[] sort(int[] nums) {
        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            sortedNums[i] = nums[minIndex];
            nums[minIndex] = Integer.MAX_VALUE;
        }
        return sortedNums;
    }
}