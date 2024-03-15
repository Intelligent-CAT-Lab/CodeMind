import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String out = "";
        int cap = 0;
        int small = 0;
        for (int i = 0; i < txt.length(); i++) {
            char t = txt.charAt(i);
            if (Character.isLowerCase(t)) {
                small++;
            } else {
                cap++;
            }
        }
        if (small >= cap) {
            for (int i = 0; i < txt.length(); i++) {
                out += txt.charAt(i) + " ";
            }
        } else {
            for (int i = 0; i < txt.length(); i++) {
                out += Character.toUpperCase(txt.charAt(i)) + " ";
            }
        }
        System.out.println(out);
    }
}