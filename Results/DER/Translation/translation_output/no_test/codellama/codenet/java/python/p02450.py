<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

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
This is the Python code equivalent to the Java code you provided. It uses the same logic and approach to generate all permutations of a given string. The only difference is that Python has a built-in `print()` function, so we don't need to use `System.out.println()` in Python.</s>
