<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
5.4292616764836055

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
```
import math

L = float(input())
print(math.pow(L/3, 3))
```
This code first prompts the user to enter a value for L, then uses the `math.pow()` function to calculate the cube of L/3 and print the result. The `float()` function is used to convert the input from a string to a floating-point number.</s>
