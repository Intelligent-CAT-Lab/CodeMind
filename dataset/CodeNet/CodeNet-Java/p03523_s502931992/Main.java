import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.matches("^A?KIHA?BA?RA?$")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}