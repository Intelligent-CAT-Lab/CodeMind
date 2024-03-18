import java.util.regex.*;

public class p03533 {
    public static void main(String[] args) {
        String pattern = "^A?KIHA?BA?RA?$";
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(S);
        
        if (m.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}