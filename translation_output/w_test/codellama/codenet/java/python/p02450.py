<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2
2 1


```
import java.util.Scanner;

public class p02450 { 
	static Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args) { 
    	
    	int n = scan.nextInt();
		String str = "";

    	for(int i=1; i<=n; i++) {
    		String str2 = String.valueOf(i);
    		str += str2;
    	}
    	
    	permutation(str, "");
    }
    		
    public static void permutation(String q, String ans){
    	// Base Case
    	if(q.length() <= 1) {
  		    if(ans.length() != 0) ans += " ";
    		System.out.println(ans + q);
    	}
    	// General Case
    	else {
    		for (int i = 0; i < q.length(); i++) {
    			if(ans.length() == 0) permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
    			else permutation(q.substring(0, i) + q.substring(i + 1),ans + " " + q.charAt(i));
    		}
    	}
    }    	
} 

```
[/INST]
```python
import sys

def permutation(q, ans):
    # Base Case
    if len(q) <= 1:
        if ans:
            ans += " "
        print(ans + q)
    # General Case
    else:
        for i in range(len(q)):
            if not ans:
                permutation(q[:i] + q[i+1:], ans + q[i])
            else:
                permutation(q[:i] + q[i+1:], ans + " " + q[i])

if __name__ == "__main__":
    n = int(sys.stdin.readline().strip())
    str = ""
    for i in range(1, n+1):
        str += str(i)
    permutation(str, "")
```
This is the Python code for the given Java code. The `permutation` function is the same as the Java code, with a few minor changes to make it compatible with Python. The main difference is that Python does not have a `String` class, so we use the `str` function to convert the integer `i` to a string.

The `if __name__ == "__main__":` block is used to run the code only when the file is executed directly, and not when it is imported as a module. This is because the Java code uses the `Scanner` class to read input from the user, which is not available in Python. Instead, we use the `sys.stdin.readline()` method to read a line of input from the user.

The rest of the code is the same as the Java code, with a few minor changes to make it compatible with Python.</s>
