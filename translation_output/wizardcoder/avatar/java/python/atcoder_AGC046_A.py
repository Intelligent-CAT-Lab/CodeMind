Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import java.util.Scanner

public class atcoder_AGC046_A:
    def main(args):
        i = 0
        k = 360
        j = 1
        sc = Scanner(System.in)

        if not sc.hasNextInt():
            System.err.println("Invalid input")

        i = Integer.parseInt(sc.nextLine())

        if 1 <= i and i <= 179:
            while not ((i * j) % k == 0):
                j += 1
            System.out.println(j)
        else:
            System.out.println("Invalid input")
```

Explanation:

- We import the `java.util.Scanner` class to read input from the user.
- We declare variables `i`, `k`, `j`, and `sc` to store the input integer, the modulus value, the loop counter, and the scanner object respectively.
- We check if the input is an integer using the `hasNextInt()` method of the scanner object. If it is not an integer, we print an error message to the console.
- We read the input integer using the `nextLine()` method of the scanner object and convert it to an integer using the `parseInt()` method of the `Integer` class.
- We check if the input integer is within the range of 1 to 179. If it is, we use a while loop to increment the loop counter `j` until the condition `((i * j) % k == 0)` is true. This condition checks if the product of the input integer `i` and the loop counter `j` is divisible by the modulus value `k`. If it is, we print the value of `j` to the console. If it is not, we print an error message to the console.
- If the input integer is not within the range of 1 to 179, we print an error message to the console.<|endoftext|>
