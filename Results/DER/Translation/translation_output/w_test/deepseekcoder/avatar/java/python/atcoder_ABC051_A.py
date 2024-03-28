<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud,

Expected output:
pnxnn asadasd asdasf



```
import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        System.out.println(a + " " + b + " " + c);
    }
}
```

### Response:
```python
import sys

def atcoder_ABC051_A():
    a, b, c = input().split(',')
    print(a + " " + b + " " + c)

if __name__ == "__main__":
    atcoder_ABC051_A()
```

In this Python code, we use the `input().split(',')` function to split the input string by the comma delimiter. The split function returns a list of strings, which we then assign to the variables `a`, `b`, and `c`. Finally, we print out the variables `a`, `b`, and `c` separated by spaces.
<|EOT|>
