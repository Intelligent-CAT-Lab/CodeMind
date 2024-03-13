<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
# Python code

# Python does not require importing Scanner or any other Java-specific libraries
# Python uses input() function to get user input

string = input()
count = 0
for i in range(len(string)):
    if string[i] == '2':
        count += 1
print(count)
```

This Python code does the same thing as the Java code. It prompts the user to input a string, then counts the number of '2' characters in the string and prints the count.<｜end▁of▁sentence｜>
