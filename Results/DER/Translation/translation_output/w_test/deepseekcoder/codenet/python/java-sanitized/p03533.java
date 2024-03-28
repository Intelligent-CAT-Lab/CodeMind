import java.util.regex.*;
import java.util.Scanner;

public class p03533 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "^A?KIHA?BA?RA?$";
        String S = scanner.next();
        if (Pattern.matches(pattern, S)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}