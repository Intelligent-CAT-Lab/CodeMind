import java.util.*;
public class codeforces_59_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String out = "";
        int cap = 0, small = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                small++;
            } else {
                cap++;
            }
        }
        if (small >= cap) {
            for (int i = 0; i < s.length(); i++) {
                out += Character.toLowerCase(s.charAt(i));
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                out += Character.toUpperCase(s.charAt(i));
            }
        }
        System.out.println(out);
    }
}