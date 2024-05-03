import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03533 {
    public static void main(String[] args) {
        String patternString = "^A?KIHA?BA?RA?$";
        Pattern pattern = Pattern.compile(patternString);
        String S = System.console().readLine();
        Matcher matcher = pattern.matcher(S);
        if (matcher.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}