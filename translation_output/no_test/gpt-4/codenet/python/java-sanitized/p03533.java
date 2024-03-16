import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03533 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String patternString = "^A?KIHA?BA?RA?$";
        Pattern pattern = Pattern.compile(patternString);
        
        String s = scanner.nextLine();
        Matcher matcher = pattern.matcher(s);
        
        if (matcher.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}