Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

- We import the `java.util` package to use the `Scanner` class.
- We create a `Scanner` object to read input from the user.
- We read a string `s` from the user using the `next()` method of the `Scanner` class.
- We print the first three characters of the string using the `substring()` method of the `String` class. In Python, we can access a substring of a string using the slice notation `s[start:end]`. Here, `start` is the starting index of the substring (inclusive) and `end` is the ending index of the substring (exclusive). So, `s[:3]` means we want to print the first three characters of the string.<|endoftext|>
