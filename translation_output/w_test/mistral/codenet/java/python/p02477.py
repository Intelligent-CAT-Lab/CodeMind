<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 8

Expected output:
40


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
import sys

def main():
    A = sys.stdin.readline().strip()
    B = sys.stdin.readline().strip()
    print(int(A) * int(B))

if __name__ == "__main__":
    main()
```</s>
