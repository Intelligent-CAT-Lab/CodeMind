<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
x1, y1, x2, y2 = map(lambda x: float(x), input().split(" "))
print("{:f}".format(math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)))


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double x1 = Double.parseDouble(input[0]);
        double y1 = Double.parseDouble(input[1]);
        double x2 = Double.parseDouble(input[2]);
        double y2 = Double.parseDouble(input[3]);
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.printf("%.6f", distance);
    }
}
```

This Java code does the same thing as the Python code. It reads four floating-point numbers from the input, calculates the Euclidean distance between the points (x1, y1) and (x2, y2), and prints the result. The distance is printed with 6 decimal places.
<|EOT|>
