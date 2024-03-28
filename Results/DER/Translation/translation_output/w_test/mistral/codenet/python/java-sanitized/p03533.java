import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03533 {
    public static void main(String[] args) {
        String pattern = "^A?KIHA?BA?RA?$";
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Matcher matcher = Pattern.compile(pattern).matcher(S);
        if (matcher.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}