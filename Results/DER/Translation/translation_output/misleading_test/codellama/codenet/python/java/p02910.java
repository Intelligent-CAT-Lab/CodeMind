<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        String odd = "RUD";
        String even = "LUD";

        for (int i = 0; i < s.length(); i += 2) {
            if (!odd.contains(s.charAt(i))) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!even.contains(s.charAt(j))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then it iterates over the characters of the input string using a `for` loop. For each character, it checks if it is in the `odd` or `even` string, and if it is not, it prints "No" and returns. If all characters are in the correct string, it prints "Yes" and returns.

Note that this code assumes that the input string is not empty, and that it only contains the characters "R", "U", "D", "L", and "U". If these assumptions are not met, the code may not work correctly.</s>
