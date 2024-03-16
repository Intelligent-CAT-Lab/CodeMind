import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_96_B {
    private static ArrayList<Long> balancedNumbers = new ArrayList<>();
    private static final long limit = 10000000000L;

    public static void generateBalancedNumbers(long number, int fourCount, int sevenCount) {
        if (number > limit) {
            return;
        }
        if (number > 0 && fourCount == sevenCount) {
            balancedNumbers.add(number);
        }
        generateBalancedNumbers(number * 10 + 4, fourCount + 1, sevenCount);
        generateBalancedNumbers(number * 10 + 7, fourCount, sevenCount + 1);
    }

    public static void main(String[] args) {
        generateBalancedNumbers(0, 0, 0);
        Collections.sort(balancedNumbers);

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long answer = 0;

        for (long val : balancedNumbers) {
            if (val >= n) {
                answer = val;
                break;
            }
        }

        System.out.println(answer);
        scanner.close();
    }
}