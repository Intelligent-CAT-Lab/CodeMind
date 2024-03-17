<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abc

Expected output:
cba


```
import java.util.Scanner;

public class p03227 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String[] b = a.split("");
		
		int c=a.length();
		
		if(c==3){
			String str=b[0];
			b[0]=b[2];
			b[2]=str;
		}
		
		for(int i=0;i<c;i++){		
			System.out.print(b[i]);
		} 
	}

}

```
[/INST]
```python
import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""

    for i in range(len(input_string) - 1, -1, -1):
        output_string += input_string[i]

    print(output_string)

if __name__ == "__main__":
    main()
```
This code reads a string from standard input, and then prints the string with the characters in reverse order.

Here's how it works:

1. The `main()` function reads a string from standard input using `sys.stdin.readline()`.
2. The `output_string` variable is initialized to an empty string.
3. The `for` loop iterates over the characters in the input string, starting from the last character and going backwards. For each character, the loop appends the character to the `output_string` variable.
4. After the loop is finished, the `output_string` variable contains the input string with the characters in reverse order.
5. The `print()` function is used to print the `output_string` variable to the console.

Note that this code assumes that the input string is a valid string, and does not perform any error checking or handling. If the input string is not a valid string, the code may produce unexpected results or crash.</s>
