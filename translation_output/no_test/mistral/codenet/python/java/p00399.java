<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
r,b,w,g = map(int,input().split())
print(r+b+w+g)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, b, w, g;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        r = Integer.parseInt(split[0]);
        b = Integer.parseInt(split[1]);
        w = Integer.parseInt(split[2]);
        g = Integer.parseInt(split[3]);
        System.out.println(r + b + w + g);
    }
}
```</s>
