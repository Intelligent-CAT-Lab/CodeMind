import java.util.Arrays;
import java.util.Scanner;

public class p01687 {
    public static void main(String[] args) {
        char[] ref = new char[]{'A', 'A', 'D', 'I', 'N', 'N', 'U', 'Y'};
        String aizu = "AIZUNYAN";

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() < 8) {
            System.out.println(input);
        } else {
            StringBuilder ans = new StringBuilder();
            int length = input.length();
            int i = 0;
            while (i < length) {
                if (i <= length - 8 && Arrays.equals(Arrays.copyOfRange(input.chars().toArray(), i, i+8), ref)) {
                    ans.append(aizu);
                    i += 8;
                } else {
                    ans.append(input.charAt(i));
                    i++;
                }
            }
            System.out.println(ans.toString());
        }
    }
}