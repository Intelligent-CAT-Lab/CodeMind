<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 6 6

Expected output:
3 10 -1 7


```
import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = x2 + (y1 - y2);
        int y3 = y2 - (x1 - x2);
        int x4 = x1 - (y2 - y1);
        int y4 = y1 + (x2 - x1);
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```
[/INST]
```python
import sys

x1, y1, x2, y2 = map(int, sys.stdin.readline().split())

x3 = x2 + (y1 - y2)
y3 = y2 - (x1 - x2)
x4 = x1 - (y2 - y1)
y4 = y1 + (x2 - x1)

print(x3, y3, x4, y4, sep=' ')
```
Explanation:

* `map(int, sys.stdin.readline().split())` is used to read the input from the standard input and convert it to a list of integers.
* `x1, y1, x2, y2 = map(int, sys.stdin.readline().split())` is used to unpack the list of integers into separate variables.
* `x3 = x2 + (y1 - y2)` is used to calculate the x-coordinate of the third point.
* `y3 = y2 - (x1 - x2)` is used to calculate the y-coordinate of the third point.
* `x4 = x1 - (y2 - y1)` is used to calculate the x-coordinate of the fourth point.
* `y4 = y1 + (x2 - x1)` is used to calculate the y-coordinate of the fourth point.
* `print(x3, y3, x4, y4, sep=' ')` is used to print the coordinates of the third and fourth points, separated by a space.</s>
