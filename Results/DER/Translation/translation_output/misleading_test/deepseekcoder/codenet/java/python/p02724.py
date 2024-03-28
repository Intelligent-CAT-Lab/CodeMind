<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1024

Expected output:
2048

```
import java.util.Scanner;

public class p02724 {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int X = scan.nextInt();
			
			int gohyaku = X/500;
			
			X = X-500*gohyaku;
			
			int goen = X/5;
			
			
			System.out.println(1000*gohyaku+5*goen);
		}
		
		
	}
		

}

```

### Response:
```python
def p02724():
    X = int(input())

    gohyaku = X // 500

    X = X - 500 * gohyaku

    goen = X // 5

    print(1000 * gohyaku + 5 * goen)

p02724()
```

This Python function will take an integer input, calculate the number of 1000-yen bills and 5-yen coins, and print the total amount.
<|EOT|>
