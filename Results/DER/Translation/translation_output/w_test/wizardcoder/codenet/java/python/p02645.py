Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
takahashi

Expected output:
tak


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
        
        System.out.println(s[:3]);
   }
}
```

Explanation:

In Python, we can access a substring of a string using the slice notation `string[start:end]`. In this case, we want to access the first three characters of the string, so we use `s[:3]`.<|endoftext|>
