System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 7

Expected output:
Br

```
x,a,b=map(int,input().split())
print('A' if abs(x-a)<abs(x-b) else 'B')
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        char result = 'A';
        if (Math.abs(x - a) > Math.abs(x - b)) {
            result = 'B';
        }

        System.out.println(result);
    }
}
```

Test input:
```
5 2 7
```

Expected output:
```
A
```<|endoftext|>
