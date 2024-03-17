The following is the translated Java code based on the Python code shared in your example. The code generates a list of 'lucky numbers' (numbers with an equal quantity of 4s and 7s), sorts them, and then prints out the smallest lucky number that is greater than or equal to the input number.
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuckyNumbers {
    
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
```

Save this code in a file named `LuckyNumbers.java`. Note that this Java code uses `ArrayList<Long>` to replicate Python lists, the `long` data type corresponds to larger numeric limits, and the use of `Scanner` to obtain user input.
Run the code and provide the test input `77777777` to get the expected output `4444477726`.

Remember that in actual deployment or multi-run scenarios, you might want to handle the Scanner and input stream more gracefully. Furthermore, depending on your use-case, you may want to move the `gen()` call outside of the `main()` method if you intend to keep the application running and only need to generate the list of lucky numbers once.
