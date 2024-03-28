Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxxoxoo

Expected output:
o

```
import java.util.Scanner;
public class p01521
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		char c[]=in.next().toCharArray();
		System.out.println(c[0]=='x'&&c[c.length-1]=='x'? "x":"o");
	}
}
```

### Response:
```python
import java.util.Scanner;

public class p01521 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] c = in.next().toCharArray();
        System.out.println(c[0] == 'x' and c[c.length - 1] == 'x'? "x" : "o");
    }
}
```<|endoftext|>
