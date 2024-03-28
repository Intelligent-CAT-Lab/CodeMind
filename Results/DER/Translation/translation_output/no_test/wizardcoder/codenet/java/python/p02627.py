Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02627{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[A-Z]")? "A" : "a");
    }
}
```

### Response:
```python
import re

def main():
    str = input()
    if re.match("[A-Z]", str):
        print("A")
    else:
        print("a")

if __name__ == "__main__":
    main()
```

Explanation:

- We first import the `re` module which provides support for regular expressions in Python.
- We define a function `main()` which takes input from the user using the `input()` function and stores it in the variable `str`.
- We use the `re.match()` function to check if the string `str` matches the regular expression `[A-Z]`. If it does, we print "A", otherwise we print "a".
- We use the `if __name__ == "__main__":` block to ensure that the `main()` function is only called if the script is run directly, and not if it is imported as a module.<|endoftext|>
