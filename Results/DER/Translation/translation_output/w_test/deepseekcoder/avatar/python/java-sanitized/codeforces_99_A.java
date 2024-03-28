import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] nums = num.split("\\.");
        if (Integer.parseInt(String.valueOf(nums[0].charAt(nums[0].length() - 1))) == 9) {
            System.out.println("GOTO â Vasilisa");
        } else {
            if (Integer.parseInt(String.valueOf(nums[1].charAt(0))) >= 5) {
                System.out.println(Integer.parseInt(nums[0]) + 1);
            } else {
                System.out.println(nums[0]);
            }
        }
    }
}