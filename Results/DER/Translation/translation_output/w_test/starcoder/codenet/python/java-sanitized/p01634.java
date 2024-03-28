import java.util.*;
public class p01634 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m = 0, n = 0, l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                m++;
            }
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                n++;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                l++;
            }
        }
        if (m == 0 || n == 0 || l == 0) {
            System.out.println("INVALID");
        } else {
            System.out.println("VALID");
        }
    }
}