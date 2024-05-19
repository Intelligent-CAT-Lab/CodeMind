System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import datetime

def main():
    # TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã

    S = input()
    c = list(S)

    print('2018', end='')
    for i in range(4, len(c)):
        print(c[i], end='')

if __name__ == '__main__':
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = '2017/01/07'
expected_output = '2018/01/07'
test_output = main()
assert test_output == expected_output
```<|endoftext|>
