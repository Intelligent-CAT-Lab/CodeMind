import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
System.out.println("[INST]5;s;scanner.next();"+s);
        if (s.matches("^A?KIHA?BA?RA?$")) {
System.out.println("[INST]6;None;s.matches('^A?KIHA?BA?RA?$');"+s.matches("^A?KIHA?BA?RA?$"));
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}