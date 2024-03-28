Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7

Expected output:
80

```
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class p03644 {
    public static PrintWriter out;

    public static void main(String[] args) {
        p03644.run();
    }

    private static void run() {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        Scanner sc = new Scanner(System.in);
        out.println(count(Integer.parseInt(sc.next())));
        out.close();
        sc.close();
    }

    private static int count(int pnum) {
        int result = 0;
        for (int i = 0; (int) Math.pow(2, i) <= pnum; i++) {
            result = (int) Math.pow(2, i);
        }
        return result;
    }
}

```

### Response:
```python
import java.io.BufferedOutputStream
import java.io.PrintWriter
import java.util.Scanner

class p03644:
    out = None

    @staticmethod
    def main(args):
        p03644.run()

    @staticmethod
    def run():
        p03644.out = PrintWriter(BufferedOutputStream(System.out))
        sc = Scanner(System.in)
        p03644.out.println(p03644.count(int(sc.next())))
        p03644.out.close()
        sc.close()

    @staticmethod
    def count(pnum):
        result = 0
        for i in range(0, int(math.log2(pnum))+1):
            result = int(math.pow(2, i))
        return result

p03644.main(None)
```

Note: The `math` module is not available in Python, so we need to use the `math.log2()` function to calculate the logarithm base 2 of a number. We also need to use the `int()` function to convert the result of `math.pow()` to an integer.<|endoftext|>
