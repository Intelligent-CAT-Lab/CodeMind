<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2 1 1

Expected output:
59

```
r,b,w,g = map(int,input().split())
print(r+b+w+g)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int g = sc.nextInt();
        System.out.println(r + b + w + g);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the input as an integer. The `split()` method is not needed because the input is already separated by spaces. The `print()` method is used to print the sum of the four numbers.</s>
