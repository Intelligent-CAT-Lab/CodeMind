<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
83

```
a,b = map(int,input().split())
print((a-1)*(b-1))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a-1)*(b-1));
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `a` and `b`. It then calculates the product of `a-1` and `b-1` and prints the result to the console.

Note that the `map()` function in Python is not necessary in Java, as the `Scanner` class provides a built-in method for converting strings to integers.</s>
