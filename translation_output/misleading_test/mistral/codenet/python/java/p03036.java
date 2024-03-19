<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 10 20

Expected output:
73
109
41
121
283
626
1346
2589
5137
10261

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
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        r = Integer.parseInt(split[0]);
        d = Integer.parseInt(split[1]);
        x = Integer.parseInt(split[2]);

        for (int i = 1; i < 11; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```</s>
