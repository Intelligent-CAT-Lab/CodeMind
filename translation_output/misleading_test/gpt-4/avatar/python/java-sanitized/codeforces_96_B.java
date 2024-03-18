import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_96_B {
    
    private static final long limit = 10000000000L;
    private static ArrayList<Long> list = new ArrayList<>();
    
    public static void main(String[] args) {
        gen(0, 0, 0);
        Collections.sort(list);
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = 0;
        for (long val : list) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
        scanner.close();
    }
    
    private static void gen(long number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            list.add(number);
        }
        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }
}