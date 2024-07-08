import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
var newVariable_0 = s.matches("^A?KIHA?BA?RA?$");        if (newVariable_0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}