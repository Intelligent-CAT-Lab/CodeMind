<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
SENW

Expected output:
Yes


```
import java.util.Scanner;

public class p04019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		boolean checkS = false;
		boolean checkN = false;
		boolean checkW = false;
		boolean checkE = false;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'S'){
				checkS = true;
			}else if(s.charAt(i) == 'N'){
				checkN = true;
			}else if(s.charAt(i) == 'W'){
				checkW = true;
			}else if(s.charAt(i) == 'E'){
				checkE = true;
			}
		}
		if(checkS == checkN && checkW == checkE){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}

```

@@ Response
```python
s = input()
checkS = 'S' in s
checkN = 'N' in s
checkW = 'W' in s
checkE = 'E' in s

if checkS == checkN and checkW == checkE:
    print("Yes")
else:
    print("No")
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if 'S', 'N', 'W', and 'E' are in the string, and then prints "Yes" if they are in the same quantity, and "No" otherwise.<｜end▁of▁sentence｜>
