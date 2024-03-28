<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
fAIR, LATER, OCCASIONALLY CLOUDY.

Expected output:
Fair, later, occasionally cloudy.


```
s = input()
print(s.swapcase())

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.toUpperCase().replaceAll("[^A-Z]", ""));
    }
}
```</s>
