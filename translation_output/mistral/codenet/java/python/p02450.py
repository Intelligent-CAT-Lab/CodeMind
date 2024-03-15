<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
        if len(ans) != 0:
            ans += " "
        print(ans + q)
    # General Case
    else:
        for i in range(len(q)):
            if len(ans) == 0:
                permutation(q[:i] + q[i+1:], ans + q[i])
            else:
                permutation(q[:i] + q[i+1:], ans + " " + q[i])

n = int(input())
str = ""

for i in range(1, n+1):
    str += str(i)

permutation(str, "")
```</s>
