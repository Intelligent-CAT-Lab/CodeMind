<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
-44

```
a,b = map(int,input().split())
print(a%b)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a%b);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `%` operator to calculate the remainder of `a` divided by `b`. The result is then printed to the console.

Note that the `map` function in Python is not necessary in Java, as the `Scanner` class can directly read input as integers.</s>
