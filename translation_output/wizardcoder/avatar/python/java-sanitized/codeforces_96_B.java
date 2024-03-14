import java.util.*;
public class codeforces_96_B {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int limit = 10000000000;
        gen(0, 0, 0, l, limit);
        Collections.sort(l);
        int n = Integer.parseInt(args[0]);
        int ans = 0;
        for (int val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }

    public static void gen(int number, int four, int seven, List<Integer> l, int limit) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven, l, limit);
        gen(number * 10 + 7, four, seven + 1, l, limit);
    }
}