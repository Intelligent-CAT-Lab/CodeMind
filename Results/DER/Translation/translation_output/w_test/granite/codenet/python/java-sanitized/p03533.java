import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03533 {
    public static void main(String[] args) {
        String S = "KIHBR";
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