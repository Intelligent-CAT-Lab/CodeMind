Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
c

Expected output:
O

```
import java.util.*;

public class atcoder_ABC151_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        System.out.println(++c);
    }
}
```

### Response:
```python
import java.util.*;

public class atcoder_ABC151_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        System.out.println(chr(ord(c)+1));
    }
}
```

Explanation:

In Python, we can use the `chr()` function to convert an integer to its corresponding ASCII character and the `ord()` function to convert a character to its corresponding integer. Therefore, we can use these functions to convert the input character `c` to its ASCII code, increment it by 1, and then convert it back to its corresponding character using `chr()`.<|endoftext|>
