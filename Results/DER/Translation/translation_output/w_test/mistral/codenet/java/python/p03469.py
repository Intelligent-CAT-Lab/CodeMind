<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
# Sample test case
S = "2017/01/07"

# Convert string to character array
c = S.tochar()

# Print the year
print(2018)

# Print the remaining characters
for i in range(4, len(c)):
    print(c[i], end="")
```</s>
