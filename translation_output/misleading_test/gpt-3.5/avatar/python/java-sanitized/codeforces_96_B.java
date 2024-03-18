import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_96_B {

    static List<Long> luckyNumbersList = new ArrayList<>();
    static final long LIMIT = 10000000000L;

    public static void generate(long number, int numFours, int numSevens) {
        if (number > LIMIT) {
            return;
        }
        if (number > 0 && numFours == numSevens) {
            luckyNumbersList.add(number);
        }
        generate(number * 10 + 4, numFours + 1, numSevens);
        generate(number * 10 + 7, numFours, numSevens + 1);
    }

    public static void main(String[] args) {
        generate(0, 0, 0);
        Collections.sort(luckyNumbersList);

        Scanner scanner = new Scanner(System.in);
        long target = scanner.nextLong();
        long result = 0;

        for (long value : luckyNumbersList) {
            if (value >= target) {
                result = value;
                break;
            }
        }

        System.out.println(result);
    }
}