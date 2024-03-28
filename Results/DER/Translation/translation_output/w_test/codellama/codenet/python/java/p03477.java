<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 7 1

Expected output:
Left


```
A,B,C,D=map(int,input().split())
if A+B<C+D:
  print("Right")
elif A+B==C+D:
  print("Balanced")
else:
  print("Left")
```
[/INST]
```java
import java.util.Scanner;

public class Balance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    if (A + B < C + D) {
      System.out.println("Right");
    } else if (A + B == C + D) {
      System.out.println("Balanced");
    } else {
      System.out.println("Left");
    }
  }
}
```
Note: The `map` function in Python is not available in Java, so we need to use the `Scanner` class to read the input and convert it to integers.</s>
