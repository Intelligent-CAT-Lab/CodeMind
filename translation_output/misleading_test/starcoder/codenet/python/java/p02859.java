<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
87

```
r = int(input())
print(r**2)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(r*r);
    }
}
```
"""

import sys

def main():
    r = int(input())
    print(r**2)

if __name__ == "__main__":
    main()
    sys.exit(0)
<|endoftext|>
