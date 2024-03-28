<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x1 , y1 , x2 , y2 = map ( int , input ( ) . split ( ) )
a = x2 - x1
b = y2 - y1
print ( x2 - b , y2 + a , x1 - b , y1 + a )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);
        int a = x2 - x1;
        int b = y2 - y1;
        System.out.println((x2 - b) + " " + (y2 + a) + " " + (x1 - b) + " " + (y1 + a));
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the input, calculates the difference between the second and the first pair of coordinates, and then prints the coordinates of the rectangle that is obtained by moving the second pair of coordinates by the difference in the x-direction and the difference in the y-direction.
<|EOT|>
