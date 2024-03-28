Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3 90

Expected output:
6.00000000
12.00000000
3.00000000


```
import math
a, b, c = map(int, input().split())
print(0.5*a*b*math.sin(math.radians(c)))
print(a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5)
print(b*math.sin(math.radians(c)))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double sine = Math.sin(Math.toRadians(c));
        double cosine = Math.cos(Math.toRadians(c));
        double hypotenuse = Math.sqrt(a*a + b*b - 2*a*b*cosine);
        double area = 0.5*a*b*sine;
        double perimeter = a + b + hypotenuse;
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(b*sine);
    }
}
```<|endoftext|>
