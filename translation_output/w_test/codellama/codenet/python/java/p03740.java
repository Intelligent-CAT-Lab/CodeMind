<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
Brown


```
x,y = map(int,input().split())
print('Brown' if abs(x-y)<=1 else 'Alice')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (Math.abs(x - y) <= 1) {
            System.out.println("Brown");
        } else {
            System.out.println("Alice");
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `Math.abs()` method is used to calculate the absolute value of the difference between `x` and `y`.
* The `if-else` statement is used to print the appropriate message based on the value of the absolute difference.

Note: The `Math.abs()` method is used instead of the `abs()` method in Python because Java does not have an `abs()` method in the `Math` class.</s>
