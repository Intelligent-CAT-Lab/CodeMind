<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
A = list(input())
N = len(A)

C0 = A.count("0")
C1 = A.count("1")

print(2 * min(C0, C1))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] A = scanner.nextLine().split(" ");
        int N = A.length;

        int C0 = 0;
        int C1 = 0;

        for (String s : A) {
            if (s.equals("0")) {
                C0++;
            } else if (s.equals("1")) {
                C1++;
            }
        }

        System.out.println(2 * Math.min(C0, C1));
    }
}
```</s>
