Here is the equivalent Java code for the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BalancedNumbers {

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
```

If you copy and paste this Java code into your development environment or compiler, it will perform the same function as your Python code. The code generates all balanced numbers (where the count of '4's and '7's is the same) less than the limit of 10 billion, sorts them, and then for a given input `n`, finds the smallest balanced number that is greater than or equal to `n`.
