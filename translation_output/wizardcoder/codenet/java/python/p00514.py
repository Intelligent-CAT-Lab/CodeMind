Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.math.*;
class p00514{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a*b>c){
			System.out.println(0);
			System.exit(0);
		}
		c-=a*b;
		int d=c+a-1;
		BigInteger bi=new BigInteger("1");
		for(int i=0;i<c;i++){
			bi=bi.multiply(new BigInteger(""+(d-i)));
			bi=bi.divide(new BigInteger(""+(i+1)));
		}
		System.out.println(bi.toString());
	}
}
```

### Response:
```python
import java.util.*;
import java.math.*;

class p00514:
    def main(self):
        s = Scanner(System.in)
        a = s.nextInt()
        b = s.nextInt()
        c = s.nextInt()
        if a*b > c:
            System.out.println(0)
            System.exit(0)
        c -= a*b
        d = c + a - 1
        bi = BigInteger("1")
        for i in range(c):
            bi = bi.multiply(BigInteger(str(d-i)))
            bi = bi.divide(BigInteger(str(i+1)))
        System.out.println(bi.toString())

p00514().main()
```<|endoftext|>
