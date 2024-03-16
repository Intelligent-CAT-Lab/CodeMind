<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=input().split()
a=int(a)
b=int(b)

if 0<a and a<10 and 0<b and b<10:
    print(a*b)
else:
    print("-1")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);

        if (a >= 0 && a < 10 && b >= 0 && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println("-1");
        }
    }
}
```</s>
