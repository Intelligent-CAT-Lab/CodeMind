<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
A B

Expected output:


```
A=int(10)
B=int(11)
C=int(12)
D=int(13)
E=int(14)
F=int(15)

N,M=input().split()
if N>M:
  print(">") 
elif N==M:
  print("=")
else:
  print("<")

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N > M) {
            System.out.println(">");
        } else if (N == M) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer value from the user. The `if` statement is used to compare the values of `N` and `M` and print the appropriate output.</s>
