import java.util.Scanner;

public class p02993 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(f(s));
    }

    public static String f(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return "Bad";
            }
        }
        return "Good";
    }
}