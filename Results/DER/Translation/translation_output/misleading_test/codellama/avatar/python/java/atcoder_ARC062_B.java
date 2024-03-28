<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
30

```
import sys
input = lambda : sys . stdin . readline ( ) . rstrip ( )
sys . setrecursionlimit ( 10 ** 9 )
def pin ( type = int ) : return map ( type , input ( ) . split ( ) )
def tupin ( t = int ) : return tuple ( pin ( t ) )
def lispin ( t = int ) : return list ( pin ( t ) )
from collections import Counter
def resolve ( ) :
    S = input ( )
    c = Counter ( S )
    print ( ( c [ " g " ] - c [ " p " ] ) // 2 )
resolve ( )


```
[/INST]
```java
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
```
This code reads a line of input from the user, splits it into a list of integers using the `split()` method, and then calculates the sum of the integers using a `for` loop. The sum is then printed to the console.

Note that this code assumes that the input will be a single line of text, and that the integers will be separated by spaces. If the input is not in this format, the code will not work correctly.</s>
