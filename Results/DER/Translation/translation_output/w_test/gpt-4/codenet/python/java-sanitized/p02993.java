import java.util.Scanner;

public class p02993 {

    public static String isGoodOrBad(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return "Bad";
            }
        }
        return "Good";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(isGoodOrBad(s));
    }
}