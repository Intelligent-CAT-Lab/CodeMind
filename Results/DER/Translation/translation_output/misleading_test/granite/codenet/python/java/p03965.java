System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
gpg

Expected output:
-92

```
s=input()
print(len(s)//2-s.count('p'))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result = len(s) / 2 - s.chars().filter(ch -> ch == 'p').count();
        System.out.println(result);
    }

    public static int len(String s) {
        return s.length();
    }
}
```

Test input:
gpg

Expected output:
-92<|endoftext|>
