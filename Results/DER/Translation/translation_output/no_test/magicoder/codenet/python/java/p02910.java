<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] odd = {"R", "U", "D"};
        String[] even = {"L", "U", "D"};

        for (int i = 0; i < s.length(); i += 2) {
            boolean found = false;
            for (String str : odd) {
                if (str.equals(String.valueOf(s.charAt(i)))) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            boolean found = false;
            for (String str : even) {
                if (str.equals(String.valueOf(s.charAt(j)))) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, and then checks if the characters at even and odd indices are in the respective lists. If not, it prints "No" and exits. If all characters pass the checks, it prints "Yes".<｜end▁of▁sentence｜>
