Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3 1 2

Expected output:
3.000000 0


```
import java.util.*;
import java.io.*;

public class p03001
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int w=in.nextInt();
		int h=in.nextInt();
		int x=in.nextInt();
		int y=in.nextInt();
		double ans=(double)w*(double)h/2;
		int a=0;
		if(x+x==w&&y+y==h)
			a=1;
		System.out.println(ans+" "+a);
	}
}
	
```

### Response:
```python
import sys

w, h, x, y = map(int, sys.stdin.readline().split())

ans = w * h / 2

if x + x == w and y + y == h:
    a = 1
else:
    a = 0

print(ans, a)
```

Explanation:

- We first import the `sys` module to read input from the standard input.
- We read the input values `w`, `h`, `x`, and `y` using `map(int, sys.stdin.readline().split())`.
- We calculate the area of the rectangle using `w * h / 2`.
- We check if the given point `(x, y)` lies on the boundary of the rectangle using `x + x == w and y + y == h`.
- If the point lies on the boundary, we set `a` to 1, else we set it to 0.
- Finally, we print the area and the value of `a` using `print(ans, a)`.<|endoftext|>
