<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        int A = 10;
        int B = 11;
        int C = 12;
        int D = 13;
        int E = 14;
        int F = 15;

        System.out.print("Enter N and M: ");
        String input = sc.nextLine();
        String[] split = input.split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

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
