<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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
            if (!contains(odd, s.substring(i, i + 1))) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!contains(even, s.substring(j, j + 1))) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    public static boolean contains(String[] arr, String str) {
        for (String s : arr) {
            if (s.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, and then checks if the characters at even and odd indices are in the respective arrays. If they are not, it prints "No" and exits. If it makes it through the entire string without finding any characters that are not in the arrays, it prints "Yes".<｜end▁of▁sentence｜>
