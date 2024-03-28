Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
public class codeforces_678_A {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        System.out.println((n / k + 1) * k);
    }
}
```

### Response:
```python
import java.util.Scanner

public class codeforces_678_A:
    public static void main(String[] args):
        input = Scanner(System.in)
        n = input.nextInt()
        k = input.nextInt()
        
        System.out.println((n // k + 1) * k)
```

Note: In Python, the division operator `/` always returns a float value, while the floor division operator `//` returns an integer value. Therefore, we use `//` instead of `/` to ensure that the result is an integer.<|endoftext|>
