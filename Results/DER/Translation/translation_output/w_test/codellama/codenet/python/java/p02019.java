<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 3 2 1

Expected output:
2


```
n, a, b, c = map(int, input().split())
print(n-(c+a-c+b-c))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(n - (c + a - c + b - c));
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer value from the user.
* The `split()` method is used to split the input string into individual integers.
* The `map()` method is used to convert the input strings into integers.
* The `print()` method is used to print the output.

Note: The `map()` method is not available in Java, so you will need to use a different method to convert the input strings into integers.</s>
