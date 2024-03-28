<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1 1

Expected output:
49.63264320801141

```
import math
x1, y1, x2, y2 = map(lambda x: float(x), input().split(" "))
print("{:f}".format(math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)))


```
[/INST]
```java
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.println(distance);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then uses the `Math.sqrt()` method to calculate the distance between the two points. The `Math.sqrt()` method takes a double value as an argument and returns the square root of that value. The `Math.pow()` method is used to calculate the square of the difference between the x and y coordinates of the two points. The `System.out.println()` method is used to print the result to the console.</s>
