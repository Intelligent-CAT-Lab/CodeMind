<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
2


```
import java.util.*;
public class p02741 {
	static int a[]= {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
	 int k=input.nextInt();
	 System.out.println(a[k-1]);
 }
}

```
[/INST]
```python
a = [1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51]
k = int(input())
print(a[k-1])
```</s>
