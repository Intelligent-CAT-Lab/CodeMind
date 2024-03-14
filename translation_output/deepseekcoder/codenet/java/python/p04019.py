<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
s = input()
check_s = False
check_n = False
check_w = False
check_e = False
for i in range(len(s)):
    if s[i] == 'S':
        check_s = True
    elif s[i] == 'N':
        check_n = True
    elif s[i] == 'W':
        check_w = True
    elif s[i] == 'E':
        check_e = True
if check_s == check_n and check_w == check_e:
    print("Yes")
else:
    print("No")
```
<|EOT|>
