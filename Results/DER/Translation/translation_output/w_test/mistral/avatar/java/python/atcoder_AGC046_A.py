<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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

if len(sys.argv) != 2:
    print("Input must be a single integer.")
    sys.exit(1)

n = int(sys.argv[1])

if 1 <= n <= 179:
    k = 360
    j = 1
    while True:
        if (n * j) % k == 0:
            print(j)
            break
        j += 1
else:
    print("Invalid input. Please enter an integer between 1 and 179.")
```</s>
