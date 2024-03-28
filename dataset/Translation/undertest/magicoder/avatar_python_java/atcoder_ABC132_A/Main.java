import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        if (chars[0] == chars[1] && chars[2] == chars[3] && chars[0] != chars[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}