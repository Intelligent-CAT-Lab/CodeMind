Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

In Python, we can use the `ord()` function to get the ASCII value of a character and the `chr()` function to get the character corresponding to an ASCII value. In this case, we can use `ord()` to get the ASCII value of the first character of the input string `s` and then add 1 to it using the `+` operator. Finally, we can use `chr()` to get the character corresponding to the new ASCII value and print it to the console using the `print()` function.<|endoftext|>
