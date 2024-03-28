import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class p03533 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String pattern = "^A?KIHA?BA?RA?$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(S);
        if (m.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}