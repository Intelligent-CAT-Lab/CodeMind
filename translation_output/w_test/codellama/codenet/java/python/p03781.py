<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
3


```
import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}
```
[/INST]
```
import math

def get_nth_triangle_number(n):
    return (n * (n + 1)) // 2

def main():
    x = int(input("Enter a number: "))
    i = 1
    while get_nth_triangle_number(i) < x:
        i += 1
    print(i)

if __name__ == "__main__":
    main()
```
This code uses the formula for the nth triangle number, which is (n * (n + 1)) // 2, to find the number of triangles that sum to a given number. It then prints the number of triangles that sum to the given number.

The `get_nth_triangle_number` function takes an integer `n` as input and returns the nth triangle number.

The `main` function takes no arguments and prompts the user to enter a number. It then uses a `while` loop to iterate through the numbers 1 to `x` and checks if the sum of the first `i` triangle numbers is less than `x`. If it is, it increments `i` and continues the loop. If it is not, it prints `i` and exits the loop.

The `if __name__ == "__main__":` block is used to indicate that the code should only be executed if it is run as a script, rather than being imported as a module.</s>
