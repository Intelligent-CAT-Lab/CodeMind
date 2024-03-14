import java.util.Scanner;
import java.util.regex.Pattern;
public class p03533 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Pattern pattern = Pattern.compile("^A?KIHA?BA?RA?$");
        if (pattern.matcher(S).matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}