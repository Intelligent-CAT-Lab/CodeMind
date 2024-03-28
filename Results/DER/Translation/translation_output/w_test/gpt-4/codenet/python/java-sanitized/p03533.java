import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03533 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = "^A?KIHA?BA?RA?$";
        
        // Reading the input from the user
        String S = scanner.next(); 

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(S);
        
        if (m.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}