<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
Yes


```
a, b, c = map(int, input().split())
if a == b and b == c :
    print("Yes")
else :
    print("No")
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input. The `split()` method is used to split the input string into individual integers. The `map()` method is used to convert the input strings into integers.</s>
