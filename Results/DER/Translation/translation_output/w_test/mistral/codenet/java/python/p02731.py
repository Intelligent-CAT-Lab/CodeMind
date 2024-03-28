<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1.000000000000


```
import java.util.Scanner;

public class p02731{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double L = scan.nextInt();
		scan.close();
		System.out.println(Math.pow(L/3, 3));
	}
}

```
[/INST]
```python
L = float(input())
print(pow(L/3, 3))
```</s>
