<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int maxLength = 0;
        int availableDigits = w / k;
        while (availableDigits > 0) {
            int currentCostPerN = String.valueOf(m).length();
            int sameCostUntil = (int) Math.pow(10, currentCostPerN);
            int usableNumbers = sameCostUntil - m;
            int useDigits = usableNumbers * currentCostPerN;
            m = sameCostUntil;
            if (availableDigits >= useDigits) {
                maxLength += usableNumbers;
                availableDigits -= useDigits;
            } else {
                maxLength += availableDigits / currentCostPerN;
                availableDigits = 0;
            }
        }
        System.out.println(maxLength);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the maximum length of the numbers that can be formed using the given digits, and prints the result.
<|EOT|>
