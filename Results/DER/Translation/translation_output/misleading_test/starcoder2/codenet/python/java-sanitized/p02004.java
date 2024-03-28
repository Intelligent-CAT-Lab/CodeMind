import java.util.*;

public class p02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int r = 0;
        int t = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'R') {
                t++;
                if (t == 4) {
                    r++;
                    t = 0;
                }
            } else {
                t--;
                if (t == -4) {
                    t = 0;
                }
            }
        }
        System.out.println(r);
    }
}