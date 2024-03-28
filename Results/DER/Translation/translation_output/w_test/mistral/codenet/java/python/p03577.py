<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE


```
import java.util.*;
class p03577{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        int length = line.length();
        System.out.println(line.substring(0,line.length()-8));
    }
}

```
[/INST]
```python
import sys

def main():
    line = input()
    length = len(line)
    print(line[:length-8])

if __name__ == "__main__":
    main()
```</s>
