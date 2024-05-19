System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n = int(input())
mask = (1<<32)-1
print('{:032b}'.format(n))
print('{:032b}'.format(~n & mask))
print('{:032b}'.format((n<<1)& mask))
print('{:032b}'.format((n>>1)& mask))

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1<<32)-1;
        System.out.println(String.format("%032d", n));
        System.out.println(String.format("%032d", ~n & mask));
        System.out.println(String.format("%032d", (n<<1)& mask));
        System.out.println(String.format("%032d", (n>>1)& mask));
    }
}
```<|endoftext|>
