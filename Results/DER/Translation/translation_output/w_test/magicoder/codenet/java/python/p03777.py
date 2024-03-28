<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
H H

Expected output:
H


```
import java.util.*;

public class p03777{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    if(a.equals(b)){
      System.out.println("H");
    }else{
      System.out.println("D");
    }
  }
}

```

@@ Response
```python
# Python code

# Get input from user
a, b = input().split()

# Compare the input strings
if a == b:
    print("H")
else:
    print("D")
```

Test input:
H H

Expected output:
H<｜end▁of▁sentence｜>
