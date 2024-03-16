<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s = raw_input()
def f(s):
	for u,v in zip(s,s[1:]):
		if u == v:return 'Bad'
	return 'Good'
print f(s)  

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() < 2) {
            System.out.println("Bad");
        } else {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    System.out.println("Bad");
                    break;
                }
            }
            System.out.println("Good");
        }
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then checks if the length of the input is less than 2. If it is, it prints "Bad" and exits. Otherwise, it iterates over the characters in the input string, and for each pair of adjacent characters, it checks if they are the same. If they are, it prints "Bad" and exits. If it reaches the end of the loop without finding any matching characters, it prints "Good".</s>
