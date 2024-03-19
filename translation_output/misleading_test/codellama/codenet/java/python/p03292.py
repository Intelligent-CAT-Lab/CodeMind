<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 6 3

Expected output:
-38

```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class p03292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R = sc.nextInt();
        int Y = sc.nextInt();

        int A = Math.max(Math.max(T,R),Y);
        int B = Math.min(Math.min(T,R),Y);

        System.out.println(A-B);
    }
}

```
[/INST]
```
import math

def main():
    T, R, Y = map(int, input().split())
    A = max(max(T, R), Y)
    B = min(min(T, R), Y)
    print(A - B)

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `math` module is used to calculate the maximum and minimum values of `T`, `R`, and `Y`, and the `max` and `min` functions are used to calculate the maximum and minimum values of `A` and `B`. The `input()` function is used to read the input from the user, and the `split()` method is used to split the input into a list of integers. The `map()` function is used to convert the list of integers to a list of integers. The `print()` function is used to print the result.</s>
