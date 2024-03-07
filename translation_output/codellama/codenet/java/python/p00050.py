<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```
import sys

def main():
    try:
        str = sys.stdin.readline()
        ans = str.replace("apple", "wwwp")
        ans = ans.replace("peach", "wwwa")
        ans = ans.replace("wwwp", "peach")
        ans = ans.replace("wwwa", "apple")
        print(ans)
    except:
        print("Error:", sys.exc_info()[0])

if __name__ == "__main__":
    main()
```
Note: The `try` block is used to handle any exceptions that may occur during the execution of the program. The `except` block is used to catch any exceptions that may occur and print an error message. The `if __name__ == "__main__":` block is used to ensure that the `main()` function is only executed when the script is run as a standalone program, and not when it is imported as a module.</s>
