System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxo

Expected output:
900


```
s = input()
print(700+100*s.count("o"))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(700 + 100 * count);
    }
}
```

Test input:
oxo

Expected output:
900<|endoftext|>
