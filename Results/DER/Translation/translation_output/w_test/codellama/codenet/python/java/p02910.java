<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
RUDLUDR

Expected output:
Yes


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
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};

        for (int i = 0; i < s.length(); i += 2) {
            if (!isOdd(s.charAt(i), odd)) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!isEven(s.charAt(j), even)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    private static boolean isOdd(char c, String[] odd) {
        for (String s : odd) {
            if (c == s.charAt(0)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isEven(char c, String[] even) {
        for (String s : even) {
            if (c == s.charAt(0)) {
                return true;
            }
        }
        return false;
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then it splits the input string into individual characters using the `charAt()` method. It then checks each character to see if it is in the `odd` or `even` arrays, and if it is not, it prints "No" and exits the program. If all the characters are in the correct arrays, it prints "Yes".

Note that this code assumes that the input string is always a valid sequence of characters, and it does not perform any error checking or handling. If the input string is not valid, the program may crash or produce incorrect output.</s>
