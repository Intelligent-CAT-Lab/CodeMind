import java.util.*;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        long first = (long) Math.pow(10, s);
        long second = first / 2;
        long ans = -1;
        for (long i : new long[]{l, r, first, second}) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (char k : Long.toString(curr).toCharArray()) {
                    rev += (9 - Integer.parseInt(String.valueOf(k)));
                }
                ans = Math.max(ans, Long.parseLong(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}