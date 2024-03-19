<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
512

Expected output:
YGk

```
import java.util.*;

public class codeforces_55_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n & (n - 1)) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
```
[/INST]
```python
import math

def is_power_of_two(n):
    return (n & (n - 1)) == 0

def main():
    n = int(input())
    if is_power_of_two(n):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```
Explanation:

* The `is_power_of_two` function takes an integer `n` as input and returns `True` if `n` is a power of two, and `False` otherwise.
* The function uses the bitwise AND operator `&` to check if the input `n` is a power of two. If the result of the bitwise AND operation is zero, then `n` is a power of two.
* The `main` function takes no arguments and reads an integer `n` from standard input using the `input` function. It then calls the `is_power_of_two` function with `n` as an argument and prints "YES" if the function returns `True`, and "NO" otherwise.
* The `if __name__ == "__main__":` block is used to indicate that the `main` function should be executed only when the script is run directly, and not when it is imported as a module.

Test case:
```
512
```
Output:
```
YES
```</s>
