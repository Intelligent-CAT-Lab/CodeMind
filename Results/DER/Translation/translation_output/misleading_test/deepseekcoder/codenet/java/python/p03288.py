<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1199

Expected output:
QBc

```
import java.util.*;

public class p03288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong();
        if (r < 1200) {
            System.out.println("ABC");
        } else if (r < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}

```

### Response:
```python
def p03288(r):
    if r < 1200:
        return "ABC"
    elif r < 2800:
        return "ARC"
    else:
        return "AGC"

# Test input
print(p03288(1199))
```

This Python function will return "ABC" if the input is less than 1200, "ARC" if it's less than 2800, and "AGC" otherwise.
<|EOT|>
