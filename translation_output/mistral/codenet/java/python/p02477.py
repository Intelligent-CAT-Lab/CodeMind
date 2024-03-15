<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.math.*;

class p02477{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		BigInteger A = new BigInteger(str);
		str = sc.next();
		BigInteger B = new BigInteger(str);
		System.out.println(A.multiply(B));
	}
}


```
[/INST]
```python
import java.util
import java.math

class p02477:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        str = sc.next()
        A = java.math.BigInteger(str)
        str = sc.next()
        B = java.math.BigInteger(str)
        print(A.multiply(B))
```</s>
