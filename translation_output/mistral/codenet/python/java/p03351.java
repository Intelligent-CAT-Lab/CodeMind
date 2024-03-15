<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c,d=map(int, input().split())
print("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2])
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        String result = "YNeos";
        if (Math.abs(a - c) <= d || Math.abs(a - b) <= d && Math.abs(b - c) <= d) {
            result = "Yes";
        }
        System.out.println(result);
    }
}
```</s>
