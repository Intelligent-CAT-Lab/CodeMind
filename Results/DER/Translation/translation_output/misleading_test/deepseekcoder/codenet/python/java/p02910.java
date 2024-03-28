<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
RUDLUDR

Expected output:
Yesv

```
s = input()
odd = ["R", "U", "D"]
even = ["L", "U", "D"]

for i in range(0,len(s),2):
	if s[i] not in odd:
		print("No")
		exit()
		
for j in range(1,len(s),2):
	if s[j] not in even:
		print("No")
		exit()
		
print("Yes")	
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String odd = "RUD";
        String even = "LUD";

        for (int i = 0; i < s.length(); i += 2) {
            if (odd.indexOf(s.charAt(i)) == -1) {
                System.out.println("No");
                System.exit(0);
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (even.indexOf(s.charAt(j)) == -1) {
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, then checks if every other character in the string is in the corresponding list of allowed characters (odd or even index). If it finds a character that is not allowed, it prints "No" and exits. If it doesn't find any such characters, it prints "Yes".
<|EOT|>
