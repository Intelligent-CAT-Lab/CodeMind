import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class p03533 {
    public static void main(String[] args) {
        String pattern = "^A?KIHA?BA?RA?$";
        String S = "AKIHABARA";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(S);
        if (m.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}