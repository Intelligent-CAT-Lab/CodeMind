Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int x = new java.util.Scanner(System.in).nextInt();
        if (x == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
```

### Response:
```python
import java.util.Scanner

class atcoder_ABC178_A:
    def main(self):
        x = Scanner(System.in).nextInt()
        if x == 0:
            print("1")
        else:
            print("0")

atcoder_ABC178_A().main()
```

Note: The `java.util.Scanner` class is imported from the `java.util` package in Python. Also, the `Scanner` class is instantiated using the `Scanner(System.in)` constructor.<|endoftext|>
