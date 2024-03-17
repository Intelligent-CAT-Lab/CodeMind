<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1 0 2 2 0 1


```
import java.util.*;
public class p02963{
	public static void main(String[]i){
		long s=Long.parseLong(new Scanner(System.in).next());
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}

```

python code:<fim_suffix><fim_middle>

```python
s=int(input())
a=1000000000
print("0 0",a,"2",a-s%a%a,"1",(s-1)//a+1)
```
<|endoftext|>
