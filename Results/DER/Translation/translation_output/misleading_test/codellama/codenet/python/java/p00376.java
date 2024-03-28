<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 30

Expected output:
2

```
a,b= map(int, input().split())
if a < b:
    print(b-a)
else:
    print(a-b)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(b - a);
        } else {
            System.out.println(a - b);
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `split()` method is used to split the input string into two integers.
* The `map()` method is used to convert the input strings to integers.
* The `if` statement is used to check which number is greater.
* The `print()` method is used to print the result.

Note: The `map()` method is not available in Java, so you need to use a different method to convert the input strings to integers.</s>
