import java.util.*;
public class p03194 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        if (n == 1) {
            System.out.println(p);
        } else if (p == 1) {
            System.out.println(1);
        } else if (n >= 40) {
            System.out.println(1);
        } else {
            int ans = 1;
            int count = 2;
            int tmp = count;
            while (tmp <= p) {
                if (p % tmp == 0) {
                    ans *= count;
                    p = p / tmp;
                    count -= 1;
                }
                count += 1;
                tmp = count;
            }
            System.out.println(ans);
        }
    }
}