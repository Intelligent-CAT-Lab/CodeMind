System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
a,b=input().split()
a=int(a)
b=int(b)

if 0<a and a<10 and 0<b and b<10:
    print(a*b)
else:
    print("-1")

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

        if (a > 0 && a < 10 && b > 0 && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println(-1);
        }
    }
}
```<|endoftext|>
