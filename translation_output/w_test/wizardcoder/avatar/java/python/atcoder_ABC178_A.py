Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
1


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
        x = java.util.Scanner(System.in).nextInt()
        if x == 0:
            print("1")
        else:
            print("0")

atcoder_ABC178_A().main()
```

Note: The `java` package is not available in Python, so we need to use the `java.util.Scanner` class instead. Also, we need to define a class `atcoder_ABC178_A` and define a `main` method inside it. Finally, we need to call the `main` method of the `atcoder_ABC178_A` class to execute the program.<|endoftext|>
