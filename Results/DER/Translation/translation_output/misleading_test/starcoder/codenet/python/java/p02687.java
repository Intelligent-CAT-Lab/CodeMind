<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABC

Expected output:
ARC

```
string = input()
if string == "ARC":
  print("ABC")
else:
  print("ARC")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```
"""

import sys

def main():
    input = sys.stdin.readline
    s = input().strip()
    if s == "ARC":
        print("ABC")
    else:
        print("ARC")

if __name__ == '__main__':
    main()
<|endoftext|>
