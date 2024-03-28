Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
0000000000


```
import java.util.*;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        while (s.contains("0B ") || s.contains("1B ")) {
            s = s.replaceAll("0B ", "");
            s = s.replaceAll("1B ", "");
        }
        
        s = s.replaceAll(" B ", "");
        
        System.out.println(s);
    }
}
```

### Response:
```python
import re

s = input()

while re.search(r"0B |1B ", s):
    s = re.sub(r"0B |1B ", "", s)

s = re.sub(r" B ", "", s)

print(s)
```

Explanation:

- We import the `re` module to use regular expressions.
- We read the input string `s` using the `input()` function.
- We use a `while` loop to repeatedly check if the string `s` contains the pattern `"0B "` or `"1B "`. If it does, we use the `re.sub()` function to remove all occurrences of these patterns from the string.
- We then use `re.sub()` again to remove all occurrences of the pattern `" B "` from the string.
- Finally, we print the modified string `s`.<|endoftext|>
