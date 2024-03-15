<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
r,d,x = (int(i) for i in input().split())

for i in range(1,11):
    x = r*x-d
    print(x)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, d, x;
        System.out.print("Enter the values of r, d and x: ");
        r = scanner.nextInt();
        d = scanner.nextInt();
        x = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```</s>
