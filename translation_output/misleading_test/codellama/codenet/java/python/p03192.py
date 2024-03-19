<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1222

Expected output:
-33

```
import java.util.Scanner;

class p03192{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//æå­ã®å¥å
		String string = sc.next();
		int count =0 ;
		for(int i = 0;i < string.length();i++){
			if(string.charAt(i) == '2'){
				count++;
			}
		}
		System.out.println(count);
	}
}
```
[/INST]
```python
import sys

def main():
    string = sys.stdin.readline().strip()
    count = 0
    for char in string:
        if char == '2':
            count += 1
    print(count)

if __name__ == '__main__':
    main()
```
This code reads a string from standard input using the `sys.stdin.readline()` method, and then loops through each character in the string using a for loop. If the character is equal to '2', the count variable is incremented. Finally, the count is printed to the console using the `print()` function.

Note that in Python, the `sys.stdin.readline()` method returns a string, so we don't need to use the `strip()` method to remove the newline character at the end of the string.</s>
