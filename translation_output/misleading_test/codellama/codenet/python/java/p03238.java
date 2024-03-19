<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
Hello World 

```
n = int(input())
if n==1:
    print('Hello World')
    exit()
a = int(input())
b = int(input())
print(a+b)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
            System.exit(0);
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
```
Note: The `exit()` method is used to terminate the program immediately, which is not necessary in Java. However, it is included in the solution for consistency with the Python code.</s>
