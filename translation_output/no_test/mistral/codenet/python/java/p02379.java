<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        System.out.print("Enter x1 y1 x2 y2 separated by spaces: ");
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        double x1 = Double.parseDouble(values[0]);
        double y1 = Double.parseDouble(values[1]);
        double x2 = Double.parseDouble(values[2]);
        double y2 = Double.parseDouble(values[3]);
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.printf("Distance between (%f, %f) and (%f, %f) is: %f%n", x1, y1, x2, y2, distance);
    }
}
```</s>
