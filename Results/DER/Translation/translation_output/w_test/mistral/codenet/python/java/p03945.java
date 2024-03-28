<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
1


```
# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = (input.count("WB") + input.count("BW"));
        System.out.println(count);
    }
}
```</s>
