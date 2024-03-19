<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
((*)())

Expected output:
99

```
S=list(input())
N=S.index('*')
P=abs(S[0:N].count('(')-S[0:N].count(')'))
Q=abs(S[N+1:len(S)].count('(')-S[N+1:len(S)].count(')'))
print(min(P,Q))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int N = input.indexOf('*');
        int P = Math.abs(input.substring(0, N).chars().filter(c -> c == '(').count() - input.substring(0, N).chars().filter(c -> c == ')').count());
        int Q = Math.abs(input.substring(N + 1).chars().filter(c -> c == '(').count() - input.substring(N + 1).chars().filter(c -> c == ')').count());
        System.out.println(Math.min(P, Q));
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses the `indexOf` method to find the index of the first occurrence of the `*` character in the input string. It then uses the `substring` method to extract the substring before and after the `*` character, and the `chars` method to get a stream of characters from the substring. The `filter` method is used to count the number of `(` and `)` characters in each substring, and the `Math.abs` method is used to get the absolute value of the difference between the number of `(` and `)` characters. Finally, the `Math.min` method is used to get the minimum of the two values.</s>
