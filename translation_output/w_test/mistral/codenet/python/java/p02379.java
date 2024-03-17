<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1 1

Expected output:
1.41421356


```
import math
x1, y1, x2, y2 = map(lambda x: float(x), input().split(" "))
print("{:f}".format(math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)))


```
[/INST]
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, y1, x2, y2;
        x1 = Double.parseDouble(scanner.nextLine().split(" ")[0]);
        y1 = Double.parseDouble(scanner.nextLine().split(" ")[1]);
        x2 = Double.parseDouble(scanner.nextLine().split(" ")[0]);
        y2 = Double.parseDouble(scanner.nextLine().split(" ")[1]);
        double result = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.printf("%.2f", result);
    }
}
```</s>
