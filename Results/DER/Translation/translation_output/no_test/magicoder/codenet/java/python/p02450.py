<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
def permutation(q, ans):
    # Base Case
    if len(q) <= 1:
        if ans != "": ans += " "
        print(ans + q)
    # General Case
    else:
        for i in range(len(q)):
            if ans == "": permutation(q[:i] + q[i + 1:], ans + q[i])
            else: permutation(q[:i] + q[i + 1:], ans + " " + q[i])

n = int(input())
str = ""

for i in range(1, n + 1):
    str2 = str(i)
    str += str2

permutation(str, "")
```

This Python code does the same thing as the Java code. It reads an integer from the user, generates a string of numbers from 1 to the input number, and then calls the `permutation` function to print all possible permutations of the generated string.<｜end▁of▁sentence｜>
