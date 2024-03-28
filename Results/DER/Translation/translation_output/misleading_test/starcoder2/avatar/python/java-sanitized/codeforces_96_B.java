import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class codeforces_96_B {
    public static void main(String[] args) {
        ArrayList<Long> l = new ArrayList<Long>();
        long limit = 10000000000L;
        gen(0, 0, 0, l);
        Collections.sort(l);
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for (long val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }

    public static void gen(long number, int four, int seven, ArrayList<Long> l) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven, l);
        gen(number * 10 + 7, four, seven + 1, l);
    }
}