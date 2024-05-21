import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class p03533 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Pattern pattern = Pattern.compile("^A?KIHA?BA?RA?$");
        Matcher matcher = pattern.matcher(S);
        if (matcher.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}