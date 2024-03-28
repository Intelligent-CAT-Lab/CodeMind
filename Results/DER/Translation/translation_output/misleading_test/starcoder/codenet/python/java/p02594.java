<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
N:o

```
X = int(input())
if X >= 30:
    print("Yes")
else:
    print("No")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

'''
<|endoftext|>
