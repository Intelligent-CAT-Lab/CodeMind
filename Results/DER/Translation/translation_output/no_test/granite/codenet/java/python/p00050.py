System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import re

def main():
    str = input()
    ans = re.sub(r'apple', 'wwwp', str)
    ans = re.sub(r'peach', 'wwwa', ans)
    ans = re.sub(r'wwwp', 'peach', ans)
    ans = re.sub(r'wwwa', 'apple', ans)
    print(ans)

if __name__ == "__main__":
    main()
```<|endoftext|>
