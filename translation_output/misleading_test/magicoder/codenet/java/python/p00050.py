<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
the cost of one peach is higher than that of one apple.

Expected output:
the cost of one apple is higher than that of one peach. )

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

@@ Response
Here is the Python equivalent of the given Java code:

```python
def main():
    str = input()
    ans = str.replace("apple", "wwwp")
    ans = ans.replace("peach", "wwwa")
    ans = ans.replace("wwwp", "peach")
    ans = ans.replace("wwwa", "apple")
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input from the user, replaces "apple" with "wwwp", "peach" with "wwwa", "wwwp" with "peach", and finally "wwwa" with "apple". The result is then printed to the console.<｜end▁of▁sentence｜>
