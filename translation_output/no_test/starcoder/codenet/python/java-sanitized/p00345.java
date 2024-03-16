import java.util.*;
public class p00345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = s.indexOf('.');
        int d = s.length() - i - 1;
        int l = s.indexOf('(') - i - 1;
        if (l == -1) {
            System.out.println(s.substring(0, i) + "/" + "1" + "0" + "^" + d);
        } else {
            System.out.println(s.substring(0, i) + "/" + "1" + "0" + "^" + (d - 2) + " - " + s.substring(s.indexOf('(') + 1, s.indexOf(')')));
        }
    }
}