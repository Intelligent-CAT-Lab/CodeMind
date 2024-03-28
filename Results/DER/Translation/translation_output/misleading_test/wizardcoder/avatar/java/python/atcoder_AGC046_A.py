Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.Scanner;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        int i;
        int k = 360;
        int j = 1;
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.err.println("Invalid input");
        }

        i = Integer.parseInt(sc.nextLine());

        if (1 <= i and i <= 179) {
            while ((i * j) % k!= 0):
                j += 1;
            System.out.println(j);
        } else {
            System.out.println("Invalid input");
        }
    }
}
```

Note:
- In Python, we use `:` instead of `;` to indicate the end of a while loop.
- In Python, we use `and` instead of `&&` to combine conditions.
- In Python, we use `+=` instead of `++` to increment a variable.<|endoftext|>
