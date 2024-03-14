Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import java.util.*;
import java.math.*;

class p02477:
    def main(self):
        sc = Scanner(System.in)
        str = sc.next()
        A = BigInteger(str)
        str = sc.next()
        B = BigInteger(str)
        System.out.println(A.multiply(B))

if __name__ == '__main__':
    p02477().main()
```<|endoftext|>
