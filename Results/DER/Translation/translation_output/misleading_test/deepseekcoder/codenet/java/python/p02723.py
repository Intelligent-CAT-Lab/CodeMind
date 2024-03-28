<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
sippuu

Expected output:
%gg

```
import java.util.*;

class p02723{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    if(s.charAt(2)==s.charAt(3) && s.charAt(4) == s.charAt(5))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
```

### Response:
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    
    if s[2] == s[3] and s[4] == s[5]:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

In this Python code, we use `sys.stdin.readline().strip()` to read the input string. Then we check if the 3rd and 4th characters of the string are the same as the 5th and 6th characters. If they are, we print "Yes", otherwise we print "No".
<|EOT|>
