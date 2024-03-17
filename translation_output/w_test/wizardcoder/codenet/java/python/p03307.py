Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03307 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(problem102a(n));
    }

    private static int problem102a(int n) {
        return (n % 2 == 0)? n : (n * 2);
    }
}
```

### Response:
```python
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03307 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(problem102a(n));
    }

    private static int problem102a(int n) {
        if n % 2 == 0:
            return n
        else:
            return n * 2
    }
}
```

In Python, we can use the `if` statement to check if a condition is true or false. In this case, we can use the modulo operator `%` to check if `n` is even or odd. If `n` is even, we return `n`. If `n` is odd, we return `n * 2`.<|endoftext|>
