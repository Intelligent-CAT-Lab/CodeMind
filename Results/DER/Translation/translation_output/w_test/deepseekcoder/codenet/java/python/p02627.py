<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
B

Expected output:
A


```
import java.util.*;

public class p02627{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[A-Z]") ? "A" : "a");
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
<|EOT|>
