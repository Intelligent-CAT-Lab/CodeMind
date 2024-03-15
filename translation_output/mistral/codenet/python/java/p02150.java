<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```


a,b,x = [int(i) for i in input().split()]

d = a - b
n = max(0,(x - b)) // d
ans = x + n * b
print(ans % 1000000007)


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, x;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        a = Integer.parseInt(split[0]);
        b = Integer.parseInt(split[1]);
        x = Integer.parseInt(split[2]);

        int d = a - b;
        int n = Math.max(0, (x - b) // d);
        long ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}
```</s>
