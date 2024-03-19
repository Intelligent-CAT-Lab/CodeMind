<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
the cost of one peach is higher than that of one apple.

Expected output:
the cost of one apple is higher than that of one peach. )

```
import java.util.Scanner;

public class p00050{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  String str=sc.nextLine();
			  String ans=str.replace("apple", "wwwp");
			  ans=ans.replace("peach", "wwwa");
			  ans=ans.replace("wwwp", "peach");
			  ans=ans.replace("wwwa", "apple");
			  System.out.println(ans);
		  }
	}
}

```
[/INST]
```
import java.util.Scanner;

public class p00050{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  String str=sc.nextLine();
			  String ans=str.replace("apple", "wwwp");
			  ans=ans.replace("peach", "wwwa");
			  ans=ans.replace("wwwp", "peach");
			  ans=ans.replace("wwwa", "apple");
			  System.out.println(ans);
		  }
	}
}
```

In this code, the `Scanner` class is used to read input from the user. The `nextLine()` method is used to read a line of input from the user. The input is then stored in the `str` variable.

The `replace()` method is used to replace all occurrences of the word "apple" with "wwwp" in the input string. The `replace()` method is also used to replace all occurrences of the word "peach" with "wwwa" in the input string.

The `replace()` method is also used to replace all occurrences of the word "wwwp" with "peach" in the input string. The `replace()` method is also used to replace all occurrences of the word "wwwa" with "apple" in the input string.

Finally, the `System.out.println()` method is used to print the modified input string to the console.

In Python, you can use the `input()` function to read input from the user, and the `replace()` method to replace all occurrences of a substring with another substring.

Here is an example of how you could translate the Java code to Python:
```
import sys

def main():
    str = input("Enter a sentence: ")
    ans = str.replace("apple", "wwwp")
    ans = ans.replace("peach", "wwwa")
    ans = ans.replace("wwwp", "peach")
    ans = ans.replace("wwwa", "apple")
    print(ans)

if __name__ == "__main__":
    main()
```
This code will prompt the user to enter a sentence, and then replace all occurrences of the words "apple" and "peach" with their corresponding replacements. The code will then print the modified sentence to the console.</s>
