import java.util.Scanner;

public class p03865 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String ans;

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() % 2 == 1) {
                ans = "Second";
            } else {
                ans = "First";
            }
        } else {
            if (s.length() % 2 == 1) {
                ans = "First";
            } else {
                ans = "Second";
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}