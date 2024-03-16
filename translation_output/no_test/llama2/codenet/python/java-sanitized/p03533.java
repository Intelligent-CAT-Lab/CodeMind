import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03533 {
    public static void main(String[] args) {
        String S = "KIHABARA";
        Pattern pattern = Pattern.compile("^A?KIHA?BA?RA?$");
        Matcher matcher = pattern.matcher(S);
        if (matcher.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}