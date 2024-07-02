import java.util.*;

public class Main {
    public void main(Scanner sc) {
        String s = sc.next();
System.out.println("[INST]4;s;sc.next();"+s);
        int length = s.length();
System.out.println("[INST]5;length;s.length();"+length);

        int cnt = 0;
        int l = 0;
        int r = length - 1;
        while (l <= r) {
            char cl = s.charAt(l);
System.out.println("[INST]11;cl;s.charAt(l);"+cl);
            char cr = s.charAt(r);
System.out.println("[INST]12;cr;s.charAt(r);"+cr);

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
        new Main().main(sc);
        sc.close();
    }
}
