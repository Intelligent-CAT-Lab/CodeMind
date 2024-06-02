import java.util.*;

public class p03569 {
    public void main(Scanner sc) {
        String s = sc.next();
        int length = s.length();

        int cnt = 0;
        int l = 0;
        int r = length - 1;
        while (l <= r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);

            if (cl == cr) {
                l++;
                r--;
            } else {
                if (cl == 'x') {
                    cnt++;
                    l++;
                } else if (cr == 'x') {
                    cnt++;
                    r--;
                } else {
                    cnt = -1;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03569().main(sc);
        sc.close();
    }
}
