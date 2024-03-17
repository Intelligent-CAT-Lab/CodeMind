import java.util.*;
public class p02910 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String odd = "RUD";
        String even = "LUD";
        for (int i = 0; i < s.length(); i++) {
            if (odd.indexOf(s.charAt(i)) == -1) {
                System.out.println("No");
                return;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            if (even.indexOf(s.charAt(i)) == -1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}