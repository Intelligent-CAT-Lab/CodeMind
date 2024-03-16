import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_96_B {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        int limit = 10000000000;

        gen(0, 0, 0);
        l.sort(null);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;

        for (int val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }

        System.out.println(ans);
    }

    public static void gen(int number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }
}