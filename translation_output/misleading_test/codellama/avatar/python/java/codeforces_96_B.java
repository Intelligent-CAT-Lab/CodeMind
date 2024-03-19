<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
77777777

Expected output:
4444477726

```
l = [ ]
limit = 10000000000
def gen ( number , four , seven ) :
    if ( number > limit ) :
        return
    if ( number > 0 and four == seven ) :
        l . append ( number )
    gen ( number * 10 + 4 , four + 1 , seven )
    gen ( number * 10 + 7 , four , seven + 1 )
def main ( ) :
    gen ( 0 , 0 , 0 )
    l . sort ( )
    n = int ( input ( ) )
    ans = 0
    for val in l :
        if ( val >= n ) :
            ans = val
            break
    print ( ans )
main ( )


```
[/INST]
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
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
```
This code is a solution to the problem you provided. It uses a recursive function `gen` to generate all possible numbers that can be formed by concatenating 4s and 7s, and then it sorts the list of numbers and finds the first number that is greater than or equal to the input number.

The `gen` function takes three parameters: `number`, `four`, and `seven`. `number` is the current number being generated, `four` is the number of 4s in the current number, and `seven` is the number of 7s in the current number. The function checks if the current number is greater than the limit, and if it is, it returns.

If the current number is greater than 0 and the number of 4s is equal to the number of 7s, the function adds the current number to the list `l`.

The function then calls itself twice, once with the current number multiplied by 10 and the digit 4 added to it, and once with the current number multiplied by 10 and the digit 7 added to it. This creates a new number that is one digit longer than the current number, and the function repeats the process until the limit is reached.

The `main` function first calls the `gen` function with the initial values of 0, 0, and 0, which generates all possible numbers that can be formed by concatenating 4s and 7s. It then sorts the list of numbers and finds the first number that is greater than or equal to the input number.

The `main` function then prints the answer.

I hope this helps! Let me know if you have any questions.</s>
