<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
import numpy as np

n = int(sys.stdin.readline().strip())
a = int(np.sqrt(n))
print(str(a*a))
```
[/INST]
```java
import java.util.Scanner;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (int) Math.sqrt(n);
        System.out.println(a * a);
    }
}
```</s>
