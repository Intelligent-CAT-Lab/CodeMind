<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int w = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int k = Integer.parseInt(split[2]);
        int maxLength = 0;
        int availableDigits = w / k;
        while (availableDigits > 0) {
            int currentCostPerN = (int) Math.pow(10, (double) (m / k));
            int usableNumbers = currentCostPerN - m;
            int useDigits = usableNumbers * currentCostPerN;
            m = currentCostPerN;
            if (availableDigits >= useDigits) {
                maxLength += usableNumbers;
                availableDigits -= useDigits;
            } else {
                maxLength += (availableDigits / currentCostPerN);
                availableDigits = 0;
            }
        }
        System.out.println(maxLength);
    }
}
```</s>
