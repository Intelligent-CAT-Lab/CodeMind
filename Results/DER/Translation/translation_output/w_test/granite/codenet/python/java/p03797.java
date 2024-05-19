System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 6

Expected output:
2


```
s, c = map(int, input().split())

print(s + ((c-s*2)//4)) if s * 2 <= c else print(c//2)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int c = scanner.nextInt();
        int result;

        if (s * 2 <= c) {
            result = s + ((c - s * 2) / 4);
        } else {
            result = c / 2;
        }

        System.out.println(result);
    }
}
```

Test input:
```
1 6
```

Expected output:
```
2
```<|endoftext|>
