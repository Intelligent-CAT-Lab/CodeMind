<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    try:
        i = int(sys.stdin.readline().strip())
        if 1 <= i <= 179:
            j = 1
            while (i * j) % 360 != 0:
                j += 1
            print(j)
        else:
            print("Invalid input")
    except ValueError:
        print("Invalid input")

if __name__ == "__main__":
    main()
```
Note: The code is written in Python 3.x and uses the `sys` module to read input from stdin. The `try-except` block is used to handle the case where the input is not a valid integer.</s>
