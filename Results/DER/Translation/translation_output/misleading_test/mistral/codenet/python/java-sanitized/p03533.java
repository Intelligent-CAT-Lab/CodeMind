import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03533 {
    public static void main(String[] args) {
        String input = "KIHBR";
        String pattern = "^A?KIHA?BA?RA?$";
        Matcher matcher = Pattern.compile(pattern).matcher(input);
        if (matcher.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}