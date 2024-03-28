Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
takahashi

Expected output:
taXk

```
import java.util.*;
 
public class p02645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.println(s.substring(0,3));
   }
}

```

### Response:
```python
import java.util.*;

public class p02645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.println(s[0:3]);
   }
}
```

Explanation:

In Python, we can access characters in a string using indexing. The syntax for indexing is `string[start:end]`, where `start` is the starting index (inclusive) and `end` is the ending index (exclusive). If `start` is not provided, it defaults to 0, and if `end` is not provided, it defaults to the length of the string.

In the given Java code, we are using the `substring` method to extract the first 3 characters of the input string. In Python, we can achieve the same result using string slicing. The syntax for slicing is `string[start:end:step]`, where `step` is the increment/decrement value. If `step` is not provided, it defaults to 1.

In this case, we can simply use `s[0:3]` to extract the first 3 characters of the string `s`.<|endoftext|>
