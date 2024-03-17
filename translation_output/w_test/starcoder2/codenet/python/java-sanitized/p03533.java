import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class p03533 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Pattern p = Pattern.compile("^A?KIHA?BA?RA?$");
        Matcher m = p.matcher(S);
        if (m.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}