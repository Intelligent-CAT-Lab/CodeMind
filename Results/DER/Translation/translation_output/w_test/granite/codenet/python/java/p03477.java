System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if (A + B < C + D) {
            System.out.println("Left");
        } else if (A + B == C + D) {
            System.out.println("Balanced");
        } else {
            System.out.println("Right");
        }
    }
}
```

Test input:
```
3 8 7 1
```

Expected output:
```
Left
```<|endoftext|>
