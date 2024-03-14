<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    s = input()

    while "0B " in s or "1B " in s:
        s = re.sub("0B ", "", s)
        s = re.sub("1B ", "", s)

    s = re.sub(" B ", "", s)

    print(s)

if __name__ == "__main__":
    main()
```
<|EOT|>
