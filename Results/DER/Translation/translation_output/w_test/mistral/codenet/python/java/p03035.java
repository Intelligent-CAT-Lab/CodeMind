<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
30 100

Expected output:
100


```
A,B=map(int,input().split())
if A>=13:
  print(B)
elif 6<=A<=12:
  print(B//2)
else:
  print(0)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A >= 13) {
            System.out.println(B);
        } else if (6 <= A <= 12) {
            System.out.println(B / 2);
        } else {
            System.out.println(0);
        }
    }
}
```</s>
