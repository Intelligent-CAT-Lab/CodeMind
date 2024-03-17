import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i]) == 0) {
                result = i + 1;
                break;
            }
        }
        System.out.println(result);
    }
}