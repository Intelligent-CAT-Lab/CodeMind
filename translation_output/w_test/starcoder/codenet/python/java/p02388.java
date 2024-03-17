<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
8


```
x = int(raw_input())
print x*x*x
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x*x*x);
    }
}
```
"""

import sys

def main():
    x = int(raw_input())
    print x*x*x

if __name__ == "__main__":
    main()
    sys.exit(0)
<|endoftext|>
