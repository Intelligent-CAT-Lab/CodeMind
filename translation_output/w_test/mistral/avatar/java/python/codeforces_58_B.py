<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
733035

Expected output:
733035 
244345 
48869 
1 

```
import java.util.*;
import java.lang.*;
import java.io.*;

public class codeforces_58_B {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " ");
        int m = n;
        for (int i = n - 1; i > 0; i--) {
            if (m % i == 0) {
                System.out.println(i + " ");
                m = i;
            }
        }
    }
}
```
[/INST]
```python
n = int(input())
print(n)
m = n
for i in range(n-1, 0, -1):
    if m % i == 0:
        print(i)
        m = i
```</s>
