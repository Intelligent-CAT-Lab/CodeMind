System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

s = input()
checkS = False
checkN = False
checkW = False
checkE = False

for c in s:
    if c == 'S':
        checkS = True
    elif c == 'N':
        checkN = True
    elif c == 'W':
        checkW = True
    elif c == 'E':
        checkE = True

if checkS == checkN and checkW == checkE:
    print("Yes")
else:
    print("No")
```<|endoftext|>
