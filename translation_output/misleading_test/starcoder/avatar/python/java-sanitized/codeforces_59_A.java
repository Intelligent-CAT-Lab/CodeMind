import java.util.*;
public class codeforces_59_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String out = " ";
        int cap = 0;
        int small = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) >= 'a' && txt.charAt(i) <= 'z') {
                small++;
            } else {
                cap++;
            }
        }
        if (small >= cap) {
            for (int i = 0; i < txt.length(); i++) {
                out += txt.charAt(i);
            }
        } else {
            for (int i = 0; i < txt.length(); i++) {
                out += (char) (txt.charAt(i) - 32);
            }
        }
        System.out.println(out);
    }
}