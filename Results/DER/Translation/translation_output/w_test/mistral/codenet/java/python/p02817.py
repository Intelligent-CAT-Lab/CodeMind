<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oder atc

Expected output:
atcoder


```
import java.util.Scanner;

public class p02817 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		String tString = in.next();
		System.out.println(tString + string);
		in.close();
	}
}
```
[/INST]
```python
string = input()
tString = input()
print(tString + string)
```</s>
