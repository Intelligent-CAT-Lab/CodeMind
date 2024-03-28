<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 7

Expected output:
Br

```
x,a,b=map(int,input().split())
print('A' if abs(x-a)<abs(x-b) else 'B')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `Math.abs()` method is used to calculate the absolute value of a number.
* The `if` statement is used to compare the absolute values of `x - a` and `x - b`, and print "A" if the first one is less than the second one, and "B" otherwise.

Note: The `Scanner` class is part of the `java.util` package, so you need to import it at the beginning of your code.</s>
