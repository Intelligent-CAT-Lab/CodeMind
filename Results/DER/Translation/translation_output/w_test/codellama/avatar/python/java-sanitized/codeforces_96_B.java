import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_96_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        int limit = 10000000000;
        int four = 0;
        int seven = 0;

        gen(0, four, seven);
        l.sort(null);

        for (int val : l) {
            if (val >= n) {
                System.out.println(val);
                break;
            }
        }
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