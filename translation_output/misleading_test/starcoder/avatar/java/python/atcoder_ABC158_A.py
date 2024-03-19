<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBA

Expected output:
Yzes

```
import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str.equals("AAA") || str.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

str = sys.stdin.readline().strip()

if str == "AAA" or str == "BBB":
    print("No")
else:
    print("Yes")
```

"""

import sys

str = sys.stdin.readline().strip()

if str == "AAA" or str == "BBB":
    print("No")
else:
    print("Yes")
<|endoftext|>
