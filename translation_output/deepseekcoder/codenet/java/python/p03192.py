<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p03192{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//æå­ã®å¥å
		String string = sc.next();
		int count =0 ;
		for(int i = 0;i < string.length();i++){
			if(string.charAt(i) == '2'){
				count++;
			}
		}
		System.out.println(count);
	}
}
```

### Response:
```python
import sys

def main():
    string = sys.stdin.readline().strip()
    count = string.count('2')
    print(count)

if __name__ == "__main__":
    main()
```
<|EOT|>
