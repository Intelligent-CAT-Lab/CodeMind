<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2017/01/07

Expected output:
2018/01/07


```
import java.util.Scanner;

public class p03469 {

	public static void main(String[] args) {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã

		  Scanner sc = new Scanner(System.in);
		  
		  String S = sc.nextLine();
		  char c [] = S.toCharArray();
		  
		  System.out.print(2018);
		 for(int i = 4; i <c.length;i++) {
			 System.out.print(c[i]);
		 }
		 

	}

}

```

python code:<fim_suffix><fim_middle>

```python
import sys

S = sys.stdin.readline().strip()

print(S[:4] + '2018' + S[4:])
```
<|endoftext|>
