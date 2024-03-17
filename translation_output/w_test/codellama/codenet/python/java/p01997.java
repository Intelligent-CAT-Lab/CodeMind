<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
33.510322


```
from math import pi

A, B = map(float, input().split())
print('{:.10f}'.format(4/3*pi*B**3))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double volume = 4/3*Math.PI*B*B*B;
        System.out.println(String.format("%.10f", volume));
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then uses the `Math.PI` constant to calculate the volume of the sphere. The `String.format()` method is used to format the output to 10 decimal places.</s>
