<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a + b < c + d) {
            System.out.println("Right");
        } else if (a + b == c + d) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
    }
}
```
<|endoftext|>
