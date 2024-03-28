<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BACD

Expected output:
Yes


```
S = input()
if S.count("AC") >= 1:
  print("Yes")
else:
  print("No")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if (S.contains("AC")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
