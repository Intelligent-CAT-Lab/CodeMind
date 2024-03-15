<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        System.out.println((lambda x: x.count('WB') + x.count('BW'))(scanner.nextLine()));
    }
}
```</s>
