System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1900

Expected output:
100


```
n=int(input())
print(1000-n%1000 if n%1000!=0 else 0)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1000 - (n % 1000);
        if (result == 1000) {
            result = 0;
        }
        System.out.println(result);
    }
}
```

Test input:
```
1900
```

Expected output:
```
100
```<|endoftext|>
