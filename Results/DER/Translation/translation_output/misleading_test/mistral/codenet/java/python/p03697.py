<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 3

Expected output:
-30

```
import java.util.*;
public class p03697 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a + b >= 10) {
    		System.out.println("error"); 
		}
		else {
		    System.out.println(a + b);
		}
	}
}
```
[/INST]
```python
a = int(input())
b = int(input())
if a + b >= 10:
    print("error")
else:
    print(a + b)
```</s>
