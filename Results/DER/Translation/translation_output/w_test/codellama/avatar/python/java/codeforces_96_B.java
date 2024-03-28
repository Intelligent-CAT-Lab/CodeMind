<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
77777777

Expected output:
4444477777


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

public class Solution {

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
```
This is a recursive solution to the problem. The `gen` function takes three parameters: `number`, `four`, and `seven`. The `number` parameter is the current number being generated, the `four` parameter is the number of 4s in the current number, and the `seven` parameter is the number of 7s in the current number.

The function first checks if the current number is greater than the limit, and if so, it returns. Otherwise, it checks if the current number is greater than 0 and if the number of 4s is equal to the number of 7s. If both conditions are true, it adds the current number to the list `l`.

The function then recursively calls itself with the current number multiplied by 10 and adding 4 or 7, depending on the current number of 4s or 7s.

The `main` function first takes an input from the user, and then calls the `gen` function with the input as the initial value of `number`, 0 as the initial value of `four`, and 0 as the initial value of `seven`.

The `gen` function then sorts the list `l` and then iterates through the list, printing the first number that is greater than or equal to the input.

Note that this solution assumes that the input is a positive integer. If the input is not a positive integer, the program will not work correctly.</s>
