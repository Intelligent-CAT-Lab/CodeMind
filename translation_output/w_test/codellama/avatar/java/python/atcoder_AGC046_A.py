<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
360


```
import java.util.Scanner;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int i;
        int k = 360;
        int j = 1;
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.err.println("æ´æ°ãå¥åãã¦ãã ãã");
        }

        i = Integer.parseInt(sc.nextLine());

        if (1 <= i && i <= 179) {
            while (!((i * j) % k == 0)) {
                ++j;
            }
            System.out.println(j);
        } else {
            System.out.println("åè»¢ããè§åº¦ã¯ï¼ ï½ ï¼ï¼ï¼ã®éã§å¥åãã¦ãã ããã");
        }
    }
}
```
[/INST]
```python
import sys

def main():
    try:
        i = int(input())
        k = 360
        j = 1
        while not (i * j) % k == 0:
            j += 1
        print(j)
    except ValueError:
        print("Invalid input", file=sys.stderr)

if __name__ == "__main__":
    main()
```
This code first tries to read an integer from the input using the `input()` function. If the input is not a valid integer, it will raise a `ValueError`. The code then defines the variables `k` and `j` and starts a loop that increments `j` until the condition `(i * j) % k == 0` is met. Finally, it prints the value of `j` to the output.

Note that the code uses the `try-except` block to handle the case where the input is not a valid integer. In this case, it prints an error message to the standard error stream and exits the program.</s>
