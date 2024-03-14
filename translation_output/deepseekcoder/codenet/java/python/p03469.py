<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    # TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã

    S = sys.stdin.readline().strip()
    c = list(S)

    print(2018, end='')
    for i in range(4, len(c)):
        print(c[i], end='')

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, converts it to a list of characters, and then prints the characters after the 4th one. The year 2018 is printed first, without a newline. The `end=''` argument to `print` is used to prevent a newline after the year and the characters.
<|EOT|>
