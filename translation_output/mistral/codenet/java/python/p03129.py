<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03129 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if((sc.nextInt() + 1) / 2 >= sc.nextInt()) System.out.println("YES");
        else System.out.println("NO");
    }

}



```
[/INST]
```python
import sys

def main():
    sc = sys.stdin
    if ((sc.readline().strip() + 1) / 2 >= sc.readline().strip()):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```</s>
