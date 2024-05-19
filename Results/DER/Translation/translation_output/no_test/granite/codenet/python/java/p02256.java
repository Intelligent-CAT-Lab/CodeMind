System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
x, y = map(int, input().split())
if x > y:
  x, y = y, x
while x % y!= 0:
  x, y = y, x % y
print(y)

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        while (x % y!= 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }
        System.out.println(y);
    }
}
```<|endoftext|>
