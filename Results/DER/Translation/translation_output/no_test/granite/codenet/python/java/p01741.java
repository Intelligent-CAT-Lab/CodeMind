System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n=float(input())
print(n//1+1 if n*2**0.5<n//1+1 else n*2**0.5)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result;
        if (n * Math.sqrt(2) < Math.ceil(n) + 1) {
            result = n * Math.sqrt(2);
        } else {
            result = Math.ceil(n) + 1;
        }
        System.out.println(result);
    }
}
```<|endoftext|>
