<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
YAKINIKU

Expected output:
Ye]s

```
import java.util.*;
import java.util.Scanner;

public class p03591 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    if(s.length() < 4) {
      System.out.println("No");
      return;
    }
    String s2 = s.substring(0, 4);
    if(s2.equals( "YAKI"))System.out.println("Yes");
    else System.out.println("No");

  }
}

```
[/INST]
```python
s = input()
if len(s) < 4:
    print("No")
    exit()
s2 = s[:4]
if s2 == "YAKI":
    print("Yes")
else:
    print("No")
```</s>
