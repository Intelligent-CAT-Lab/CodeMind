System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n = int(input())

result = []
for i in range(1, int(n**(1/2)+1)):
    if n%i==0:
        result.append(max(len(str(i)), len(str(n//i))))
print(min(result))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int length = Math.max(String.valueOf(i).length(), String.valueOf(n / i).length());
                result = Math.min(result, length);
            }
        }
        System.out.println(result);
    }
}
```<|endoftext|>
