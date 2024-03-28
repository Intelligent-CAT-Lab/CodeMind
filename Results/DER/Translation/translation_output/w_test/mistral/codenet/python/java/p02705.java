<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
6.28318530717958623200


```
print(int(input())*6.28)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = scanner.nextDouble() * 6.28;
        System.out.println(result);
    }
}
```</s>
