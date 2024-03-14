Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03427 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long N = scanner.nextLong() + 1;
        scanner.close();

        // æ¡æ°
        String s = String.valueOf(N);
        int length = s.length();
        int c = Integer.parseInt(s.substring(0, 1));
        int max = (c - 1) + 9 * (length - 1);

        System.out.println(max);
    }
}
```

### Response:
```python
import java.util.Scanner

public class p03427:

    def main(args):
        scanner = Scanner(System.in)
        N = scanner.nextLong() + 1
        scanner.close()

        # æ¡æ°
        s = str(N)
        length = len(s)
        c = int(s[0])
        max = (c - 1) + 9 * (length - 1)

        print(max)
```<|endoftext|>
