<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
apple

Expected output:
apples


```
import java.util.Scanner;

public class p02546 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
       if (s.endsWith("s")) {
           System.out.println(s + "es");
       } else {
           System.out.println(s + "s");
       }



    }

}

```
[/INST]
```python
import sys

def main():
    s = sys.stdin.readline()
    if s.endswith("s"):
        print(s + "es")
    else:
        print(s + "s")

if __name__ == "__main__":
    main()
```</s>
