<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
SENW

Expected output:
Yebs

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
def check_direction(s):
    check_s = False
    check_n = False
    check_w = False
    check_e = False
    for i in s:
        if i == 'S':
            check_s = True
        elif i == 'N':
            check_n = True
        elif i == 'W':
            check_w = True
        elif i == 'E':
            check_e = True
    if check_s == check_n and check_w == check_e:
        return "Yes"
    else:
        return "No"

s = input()
print(check_direction(s))
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if the string contains 'S', 'N', 'W', and 'E' and prints "Yes" if they are present in the same quantity, otherwise it prints "No".<｜end▁of▁sentence｜>
