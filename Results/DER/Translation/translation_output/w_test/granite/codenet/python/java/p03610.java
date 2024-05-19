System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
acdr


```
s = input()
print(s[::2])
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = s.substring(0, 1);
        for (int i = 2; i < s.length(); i += 2) {
            result += s.charAt(i);
        }
        System.out.println(result);
    }
}
```

Test input:
atcoder

Expected output:
acdr<|endoftext|>
