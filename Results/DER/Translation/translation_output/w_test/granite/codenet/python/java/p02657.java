System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5

Expected output:
10


```
L, R = map(int,(input().split()))
print(L*R)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(L * R);
    }
}
```

Test input:
```
2 5
```

Expected output:
```
10
```<|endoftext|>
