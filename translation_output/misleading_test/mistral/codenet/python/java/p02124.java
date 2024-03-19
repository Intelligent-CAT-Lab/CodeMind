<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
a{1383

```
print("ai1333" + "3" * int(int(input()) / 100))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        String output = "ai" + num * "3";
        System.out.println(output);
    }
}
```</s>
