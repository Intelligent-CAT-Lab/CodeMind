<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 20

Expected output:
31

```
import java.util.*;
public class p03481 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long X = sc.nextLong();
        Long Y = sc.nextLong();

        int i=0;
        while(X<=Y){
            i++;
            X*=2;
        }

        System.out.println(i);
    }
}
```
[/INST]
```python
X, Y = map(int, input().split())

i = 0
while X <= Y:
    i += 1
    X *= 2

print(i)
```</s>
