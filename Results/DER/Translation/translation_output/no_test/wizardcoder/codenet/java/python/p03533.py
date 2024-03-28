Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
    sc = Scanner(System.in)
    pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    s = sc.nextLine()
    if re.match(pat, s):
        print("YES")
    else:
        print("NO")
    sc.close()

if __name__ == '__main__':
    main()
```

Explanation:

- We first import the `re` module which provides support for regular expressions in Python.
- We define a `main()` function which reads input from the user using the `Scanner` class and stores it in the `s` variable.
- We define a regular expression pattern `pat` which matches the given string.
- We use the `re.match()` function to check if the input string `s` matches the pattern `pat`. If it does, we print "YES", otherwise we print "NO".
- Finally, we close the scanner object to release the resources.<|endoftext|>
