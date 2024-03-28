<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 20

Expected output:
-57

```
p, m, c = map(int, input().split())
print(p+m+c)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(p+m+c);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the input as an integer. The `split()` method is not needed because the input is already separated by spaces. The `print()` method is used to print the result to the console.</s>
