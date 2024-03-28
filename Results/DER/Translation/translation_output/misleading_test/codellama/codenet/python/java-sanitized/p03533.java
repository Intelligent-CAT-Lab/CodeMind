import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class p03533 {
    public static void main(String[] args) {
        String input = "KIHBR";
        String pattern = "^A?KIHA?BA?RA?$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        if (m.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}