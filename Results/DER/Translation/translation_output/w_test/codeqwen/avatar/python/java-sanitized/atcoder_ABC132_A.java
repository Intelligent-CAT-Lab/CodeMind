import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sortedInput = new String(chars);
        if (sortedInput.charAt(0) == sortedInput.charAt(1) && sortedInput.charAt(2) == sortedInput.charAt(3) && sortedInput.charAt(0) != sortedInput.charAt(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}