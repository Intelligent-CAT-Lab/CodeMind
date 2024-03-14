Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.PrintStream;
import java.util.Scanner;
public class p03304 {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        
        long s = d == 0? n : ((n - d) * 2);
        so.println((double) s/n/n*(m-1));
    }
}
```

### Response:
```python
import java.io.PrintStream
import java.util.Scanner

class p03304:
    so = java.io.PrintStream(System.out)
    sc = Scanner(System.in)

    def main(self, args):
        n = sc.nextLong()
        m = sc.nextLong()
        d = sc.nextLong()
        
        s = d == 0 and n or ((n - d) * 2)
        so.println((double) s/n/n*(m-1))

p03304().main(None)
```<|endoftext|>
