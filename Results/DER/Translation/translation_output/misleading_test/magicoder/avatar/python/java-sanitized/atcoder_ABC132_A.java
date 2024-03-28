import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);

        if (s.charAt(0) == s.charAt(1) && s.charAt(2) == s.charAt(3) && s.charAt(0) != s.charAt(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}