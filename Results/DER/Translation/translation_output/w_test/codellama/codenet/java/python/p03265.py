<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 0 1

Expected output:
-1 1 -1 0


```
import java.util.Scanner;

public class p03265 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int a = x2 - x1;
        int b = y2 - y1;
        int x3 = x2 - b;
        int y3 = y2 + a;
        int x4 = x3 - a;
        int y4 = y3 - b;

        System.out.println(String.format("%d %d %d %d", x3, y3, x4, y4));
        sc.close();
    }

}

```
[/INST]
```python
import sys

x1, y1, x2, y2 = map(int, sys.stdin.readline().split())

a = x2 - x1
b = y2 - y1
x3 = x2 - b
y3 = y2 + a
x4 = x3 - a
y4 = y3 - b

print(f"{x3} {y3} {x4} {y4}")
```
Explanation:

* `map(int, sys.stdin.readline().split())` is used to read the input from the standard input and convert it to a list of integers.
* `x1, y1, x2, y2 = map(int, sys.stdin.readline().split())` is used to unpack the list of integers into separate variables.
* `a = x2 - x1` and `b = y2 - y1` are used to calculate the differences between the x and y coordinates of the two points.
* `x3 = x2 - b` and `y3 = y2 + a` are used to calculate the coordinates of the third point.
* `x4 = x3 - a` and `y4 = y3 - b` are used to calculate the coordinates of the fourth point.
* `print(f"{x3} {y3} {x4} {y4}")` is used to print the coordinates of the third and fourth points.

Note: The `f` in front of the string is called an f-string, it allows you to use variables inside the string.</s>
