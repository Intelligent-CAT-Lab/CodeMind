import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class codeforces_96_B {

    private static final long LIMIT = 10000000000L;
    private static ArrayList<Long> luckyNumbers = new ArrayList<>();

    private static void generate(long number, int fours, int sevens) {
        if (number > LIMIT) {
            return;
        }
        if (number > 0 && fours == sevens) {
            luckyNumbers.add(number);
        }
        generate(number * 10 + 4, fours + 1, sevens);
        generate(number * 10 + 7, fours, sevens + 1);
    }

    public static void main(String[] args) {
        generate(0, 0, 0);
        Collections.sort(luckyNumbers);
        
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long answer = 0;
        
        for (long val : luckyNumbers) {
            if (val >= n) {
                answer = val;
                break;
            }
        }
        
        System.out.println(answer);
        scanner.close();
    }
}