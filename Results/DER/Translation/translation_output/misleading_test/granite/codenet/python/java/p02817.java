System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oder atc

Expected output:
atc!oder

```
S, T = input().split()

print(T + S)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();
        System.out.println(T + S);
    }
}
```

Test input:
```
oder atc
```

Expected output:
```
atc!oder
```<|endoftext|>
