<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
-3


```
s = input().split()
print(int(s[0]) - int(s[1]))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().split(" ");
        int result = Integer.parseInt(s[0]) - Integer.parseInt(s[1]);
        System.out.println(result);
    }
}
```</s>
