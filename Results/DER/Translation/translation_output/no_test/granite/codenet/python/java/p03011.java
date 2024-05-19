System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int max = Math.max(a, Math.max(b, c));
        int result = a + b + c - max;
        System.out.println(result);
    }
}
```<|endoftext|>
