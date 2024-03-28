import java.util.*;

public class p00345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int o = s.indexOf('.');
        int p = s.indexOf('(');
        int d = s.length() - o - 1;
        int l = p - o - 1;
        String all = "";
        String sub = "";
        if (p == -1) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '.') {
                    all += s.charAt(i);
                }
            }
            System.out.println(all + "/" + (int)Math.pow(10, d));
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '.' && s.charAt(i) != '(' && s.charAt(i) != ')') {
                    if (i < p) {
                        all += s.charAt(i);
                    } else {
                        sub += s.charAt(i);
                    }
                }
            }
            d -= 2;
            System.out.println((Integer.parseInt(all) - Integer.parseInt(sub)) + "/" + (int)Math.pow(10, d) - (int)Math.pow(10, l));
        }
    }
}