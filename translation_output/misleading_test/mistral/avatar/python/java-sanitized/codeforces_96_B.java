import java.util.*;

public class codeforces_96_B {
    static List<Long> l = new ArrayList<>();
    static long limit = 10000000000;

    public static void gen(long number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gen(0, 0, 0);
        l.sort(Collections.reverseOrder());
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
}