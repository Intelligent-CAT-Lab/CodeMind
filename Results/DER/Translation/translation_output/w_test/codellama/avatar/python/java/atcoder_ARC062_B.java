<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
2


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
        int[] sortedNumbers = numbers.clone();
        Arrays.sort(sortedNumbers);
        int count = 0;
        for (int i = 0; i < sortedNumbers.length; i++) {
            if (sortedNumbers[i] == numbers[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
This code reads a line of input from the user, splits it into a list of integers, and then sorts the list. It then iterates over the sorted list and counts the number of elements that are equal to the corresponding element in the original list. Finally, it prints the count to the console.

Here's an example of how you could test this code:
```java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of input:");
        String input = scanner.nextLine();
        int[] numbers = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = input.charAt(i) - '0';
        }
        int[] sortedNumbers = numbers.clone();
        Arrays.sort(sortedNumbers);
        int count = 0;
        for (int i = 0; i < sortedNumbers.length; i++) {
            if (sortedNumbers[i] == numbers[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
This code reads a line of input from the user, converts it to a list of integers, and then sorts the list. It then iterates over the sorted list and counts the number of elements that are equal to the corresponding element in the original list. Finally, it prints the count to the console.

I hope this helps! Let me know if you have any questions.</s>
