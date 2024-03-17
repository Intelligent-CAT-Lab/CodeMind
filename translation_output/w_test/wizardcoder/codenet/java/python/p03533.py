Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
YES


```
import java.util.*;

public class p03533 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}";
        String s = sc.next();
        if(s.matches(pat)) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

}

```

### Response:
```python
import re

def main():
    s = input()
    pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    if re.match(pat, s):
        print("YES")
    else:
        print("NO")

if __name__ == '__main__':
    main()
```

Explanation:

- We import the `re` module to use regular expressions in Python.
- We define a function `main()` that takes input from the user and checks if it matches the given pattern.
- We use the `re.match()` function to check if the input string matches the pattern.
- If the input string matches the pattern, we print "YES". Otherwise, we print "NO".<|endoftext|>
