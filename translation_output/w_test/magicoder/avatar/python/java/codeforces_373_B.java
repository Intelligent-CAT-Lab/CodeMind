<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6289344232651169 4170875805886064 618522710

Expected output:
635520


```
import sys
def main ( lines ) :
    w , m , k = list ( map ( int , lines [ 0 ] . split ( ) ) )
    max_length = 0
    available_digits = int ( w / k )
    while available_digits > 0 :
        current_cost_per_n = len ( str ( m ) )
        same_cost_until = 10 ** ( current_cost_per_n )
        usable_numbers = same_cost_until - m
        use_digits = usable_numbers * current_cost_per_n
        m = same_cost_until
        if available_digits >= use_digits :
            max_length += usable_numbers
            available_digits -= use_digits
        else :
            max_length += int ( available_digits / current_cost_per_n )
            available_digits = 0
    print ( max_length )
if __name__ == " _ _ main _ _ " :
    main ( sys . stdin . readlines ( ) )


```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long w = scanner.nextLong();
        long m = scanner.nextLong();
        long k = scanner.nextLong();
        int maxLength = 0;
        long availableDigits = w / k;
        while (availableDigits > 0) {
            int currentCostPerN = String.valueOf(m).length();
            long sameCostUntil = (long) Math.pow(10, currentCostPerN);
            long usableNumbers = sameCostUntil - m;
            long useDigits = usableNumbers * currentCostPerN;
            m = sameCostUntil;
            if (availableDigits >= useDigits) {
                maxLength += usableNumbers;
                availableDigits -= useDigits;
            } else {
                maxLength += (int) (availableDigits / currentCostPerN);
                availableDigits = 0;
            }
        }
        System.out.println(maxLength);
    }
}
```

This Java code does the same thing as the Python code. It reads three long integers from the standard input, calculates the maximum length of the sequence, and prints the result.<｜end▁of▁sentence｜>
