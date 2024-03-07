<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import java.util.Scanner;

class p03192:
    def main(self):
        sc = Scanner(System.in)
        string = sc.next()
        count = 0
        for i in range(len(string)):
            if string[i] == '2':
                count += 1
        print(count)
```
This is the equivalent Python code for the given Java code. The `Scanner` class is used to read input from the user, and the `next()` method is used to read the input as a string. The `for` loop is used to iterate over the characters in the string, and the `if` statement is used to check if the current character is equal to `'2'`. If it is, the `count` variable is incremented. Finally, the `print()` function is used to print the value of `count`.</s>
