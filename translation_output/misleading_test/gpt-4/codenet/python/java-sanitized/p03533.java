import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class p03533 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "^A?KIHA?BA?RA?$";
        String S = scanner.nextLine();
        scanner.close();

        if (Pattern.matches(pattern, S)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}