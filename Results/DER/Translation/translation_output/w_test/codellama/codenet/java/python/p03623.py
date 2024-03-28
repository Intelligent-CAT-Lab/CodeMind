<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 2 7

Expected output:
B


```
import java.util.Scanner;
public class p03623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x-a) < Math.abs(x-b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```
[/INST]
```
import math

x = int(input())
a = int(input())
b = int(input())

if abs(x - a) < abs(x - b):
    print("A")
else:
    print("B")
```
Explanation:

* The `math` module is used to calculate the absolute value of the difference between `x` and `a` and `x` and `b`.
* The `abs()` function is used to calculate the absolute value of a number.
* The `input()` function is used to read input from the user.
* The `int()` function is used to convert the input to an integer.
* The `if` statement is used to compare the absolute difference between `x` and `a` with the absolute difference between `x` and `b`. If the absolute difference between `x` and `a` is less than the absolute difference between `x` and `b`, then "A" is printed, otherwise "B" is printed.</s>
