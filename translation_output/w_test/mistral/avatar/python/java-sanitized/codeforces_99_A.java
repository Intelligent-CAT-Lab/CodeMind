import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] nums = input.split("\\s+");
        int num = Integer.parseInt(nums[0]);
        if (num == 9) {
            System.out.println("GOTO  Vasilisa . ");
        } else {
            int secondNum = Integer.parseInt(nums[1]);
            if (secondNum >= 5) {
                System.out.println(num + 1);
            } else {
                System.out.println(num);
            }
        }
    }
}