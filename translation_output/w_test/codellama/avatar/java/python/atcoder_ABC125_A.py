<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 20 19

Expected output:
0


```
import java.util.Scanner;

public class atcoder_ABC125_A {
    static long n, k, m, l, a, b, c;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        k = 0;
        for (int i = 1; i * a <= n; i++) {
            k += b;
        }
        System.out.println(k);
    }
}
```
[/INST]
```
import math

def main():
    a, b, n = map(int, input().split())
    k = 0
    for i in range(1, int(math.ceil(n / a)) + 1):
        k += b
    print(k)

if __name__ == "__main__":
    main()
```
This is the Python code that translates the given Java code. The `math` module is used to calculate the ceiling of `n / a` to determine the number of times the loop will run. The `map` function is used to convert the input from a string to a list of integers. The `range` function is used to create a range of numbers from 1 to the ceiling of `n / a`, and the `for` loop is used to iterate over the range and calculate the value of `k`. Finally, the `print` function is used to output the value of `k`.</s>
