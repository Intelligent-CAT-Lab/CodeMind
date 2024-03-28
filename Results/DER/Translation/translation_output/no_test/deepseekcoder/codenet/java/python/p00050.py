<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00050{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  String str=sc.nextLine();
			  String ans=str.replace("apple", "wwwp");
			  ans=ans.replace("peach", "wwwa");
			  ans=ans.replace("wwwp", "peach");
			  ans=ans.replace("wwwa", "apple");
			  System.out.println(ans);
		  }
	}
}

```

### Response:
```python
import sys

def main():
    str = sys.stdin.readline().strip()
    ans = str.replace("apple", "wwwp")
    ans = ans.replace("peach", "wwwa")
    ans = ans.replace("wwwp", "peach")
    ans = ans.replace("wwwa", "apple")
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input from the standard input, replaces "apple" with "wwwp", "peach" with "wwwa", "wwwp" with "peach", and "wwwa" with "apple", and then prints the result.
<|EOT|>
