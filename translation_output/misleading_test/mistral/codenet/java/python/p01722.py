<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
39

```
import java.util.Scanner;

public class p01722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 0:
			System.out.println(1);
			break;
		case 1:
			System.out.println(2);
			break;
		case 2:
			System.out.println(1);
			break;
		default:
			System.out.println(0);
			break;
		}
		sc.close();
	}

}
```
[/INST]
```python
n = int(input())
if n == 0:
    print(1)
elif n == 1:
    print(2)
elif n == 2:
    print(1)
else:
    print(0)
```</s>
