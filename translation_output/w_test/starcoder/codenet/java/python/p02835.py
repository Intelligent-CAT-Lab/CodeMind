<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 9

Expected output:
win


```
import java.util.Scanner;

public class p02835{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b+c >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");

		}
	}

}

```

python code:<fim_suffix><fim_middle>

```python
a = int(input())
b = int(input())
c = int(input())
if a+b+c >= 22:
    print("bust")
else:
    print("win")
```
<|endoftext|>
