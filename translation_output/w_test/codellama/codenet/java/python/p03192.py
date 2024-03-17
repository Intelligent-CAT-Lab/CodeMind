<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1222

Expected output:
3


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

In Python, we can use the `input()` function to get the input from the user, and then use a loop to iterate over the characters in the string and count the number of occurrences of the character '2'. Here's the Python code:
```
string = input("Enter a string: ")
count = 0
for char in string:
    if char == '2':
        count += 1
print(count)
```
This code will work for any string that the user enters, and it will print the number of occurrences of the character '2' in the string.

Here's an example of how the code would work:
```
Enter a string: 1222
3
```
In this example, the user enters the string "1222", and the code prints "3" as the output, which is the number of occurrences of the character '2' in the string.</s>
