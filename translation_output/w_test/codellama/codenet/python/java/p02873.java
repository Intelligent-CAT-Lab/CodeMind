<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
<>>

Expected output:
3


```
from sys import stdin
S = str(stdin.readline().rstrip())
#l = list(map(int, stdin.readline().rstrip().split()))
#A, B, C = map(int, stdin.readline().rstrip().split())
#S = [list(map(int, stdin.readline().rstrip().split())) for _ in range(h)]#hã®å®ç¾©ãå¿ããã«

n = len(S)+1
sho = [0]*n
dai = [0]*n

for i,s in enumerate(S):
    i += 1
    if s ==">":
        sho[i] = 0
    else:
        sho[i] = sho[i-1] + 1

for i,s in enumerate(S[::-1]):
    i = n-i-2
    if s == "<":
        dai[i]=0
    else:
        dai[i] = dai[i+1] +1

seq = [max(x,y) for x,y in zip(sho,dai)]

print(sum(seq))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = input.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '>') {
                sho[i + 1] = 0;
            } else {
                sho[i + 1] = sho[i] + 1;
            }
        }

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '<') {
                dai[i] = 0;
            } else {
                dai[i] = dai[i + 1] + 1;
            }
        }

        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Math.max(sho[i], dai[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += seq[i];
        }

        System.out.println(sum);
    }
}
```
This code reads a string from the standard input, and then calculates the number of times the string ">" and "<" appear in the string, and the number of times the string ">" and "<" appear in the reverse of the string. It then calculates the maximum number of times the string ">" and "<" appear in the string or its reverse, and prints the sum of these maximum values.

The code uses the `Scanner` class to read the input string, and the `String` class to manipulate the string. It uses the `charAt` method to access the characters in the string, and the `length` method to get the length of the string. It uses the `Math.max` method to calculate the maximum of two numbers, and the `sum` method to calculate the sum of an array of numbers.

The code also uses the `for` loop to iterate over the characters in the string, and the `if` statement to check if a character is ">" or "<". It uses the `+=` operator to add the value of a variable to itself, and the `[]` operator to access the elements of an array.

The code is written in Java, and it uses the `System.out.println` method to print the result to the console.</s>
