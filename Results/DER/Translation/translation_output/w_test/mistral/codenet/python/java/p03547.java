<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
A B

Expected output:
<


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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (N > M) {
            System.out.print(">");
        } else if (N == M) {
            System.out.print("=");
        } else {
            System.out.print("<");
        }
    }
}
```</s>
