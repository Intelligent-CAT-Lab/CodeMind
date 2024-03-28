<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 4

Expected output:
Yay

```
import java.util.*;

public class p03323 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= 8 && b <= 8) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}

```
[/INST]
```python
a = int(input())
b = int(input())
if a <= 8 and b <= 8:
    print("Yay!")
else:
    print(":(")
```</s>
