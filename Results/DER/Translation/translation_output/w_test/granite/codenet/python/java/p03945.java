System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
1


```
# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) == 'B' && input.charAt(i + 1) == 'W') || (input.charAt(i) == 'W' && input.charAt(i + 1) == 'B')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

Test input:
```
BBBWW
```

Expected output:
```
1
```<|endoftext|>
