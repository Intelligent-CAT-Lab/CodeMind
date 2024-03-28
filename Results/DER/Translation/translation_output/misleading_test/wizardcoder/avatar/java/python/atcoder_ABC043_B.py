Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0000000000

Expected output:
78

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
- We take input from the user and store it in the variable `s`.
- We use a while loop to check if the string `s` contains the pattern `"0B "` or `"1B "`. If it does, we use the `re.sub()` method to replace all occurrences of these patterns with an empty string `""`.
- We then use `re.sub()` again to replace all occurrences of `" B "` with an empty string `""`.
- Finally, we print the modified string `s`.<|endoftext|>
