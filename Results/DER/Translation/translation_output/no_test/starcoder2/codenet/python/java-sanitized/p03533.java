import java.util.regex.*;
import java.util.Scanner;

public class p03533 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String pattern = "^A?KIHA?BA?RA?$";
        if (S.matches(pattern)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}