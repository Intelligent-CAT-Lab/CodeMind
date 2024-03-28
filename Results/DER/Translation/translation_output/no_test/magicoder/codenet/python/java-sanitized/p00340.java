import java.util.Arrays;
import java.util.Scanner;

public class p00340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] num = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            num[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(num);
        if (num[0] == num[1] && num[2] == num[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}