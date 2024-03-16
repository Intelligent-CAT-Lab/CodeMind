<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n=float(input())
print(n//1+1 if n*2**0.5<n//1+1 else n*2**0.5)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result = (n / 1 + 1) < n * Math.sqrt(2) ? n / 1 + 1 : n * Math.sqrt(2);
        System.out.println(result);
    }
}
```</s>
