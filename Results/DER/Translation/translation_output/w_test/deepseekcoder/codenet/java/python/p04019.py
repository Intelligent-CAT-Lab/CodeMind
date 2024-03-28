<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def p04019(s):
    checkS = 'S' in s
    checkN = 'N' in s
    checkW = 'W' in s
    checkE = 'E' in s
    if checkS == checkN and checkW == checkE:
        return "Yes"
    else:
        return "No"

print(p04019(input()))
```

This Python code does the same thing as the Java code. It checks if the input string contains 'S', 'N', 'W', and 'E' and compares their presence. If they are present the same number of times, it returns "Yes", otherwise it returns "No".
<|EOT|>
