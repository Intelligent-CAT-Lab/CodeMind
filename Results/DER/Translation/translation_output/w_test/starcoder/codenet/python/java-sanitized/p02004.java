import java.util.*;

public class p02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!= 0) {
            int r = 0;
            int t = 0;
            for (int i = 0; i < n; i++) {
                char c = sc.next().charAt(0);
                if (c == 'R') {
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
            n = sc.nextInt();
        }
    }
}