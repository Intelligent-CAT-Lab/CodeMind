<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
276

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

### Response:
```python
import sys

def main():
    k = 360
    j = 1

    try:
        i = int(input())
    except ValueError:
        print("Invalid input")
        sys.exit(1)

    if 1 <= i <= 179:
        while (i * j) % k != 0:
            j += 1
        print(j)
    else:
        print("Invalid input. Please enter a number between 1 and 179.")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input()` function to get the user input. If the input is not an integer, a `ValueError` will be raised and the program will print "Invalid input" and exit. If the input is an integer but not within the range 1 to 179, the program will print "Invalid input. Please enter a number between 1 and 179.". Otherwise, the program will find the smallest integer `j` such that `i * j` is a multiple of 360 and print it.
<|EOT|>
