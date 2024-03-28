<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

s = sys.stdin.readline().strip()

if s.count('S') == s.count('N') and s.count('W') == s.count('E'):
    print('Yes')
else:
    print('No')
```
<|endoftext|>
