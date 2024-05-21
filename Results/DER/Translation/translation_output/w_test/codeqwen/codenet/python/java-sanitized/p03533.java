import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03533 {
    public static void main(String[] args) {
        String S = "KIHBR";
        String pattern = "^A?KIHA?BA?RA?$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(S);
        if (m.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}