<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC151_A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        System.out.println(++c);
    }
}
```
[/INST]
```python
import sys

def main():
    s = input()
    c = s[0]
    print(ord(c) + 1)

if __name__ == "__main__":
    main()
```</s>
