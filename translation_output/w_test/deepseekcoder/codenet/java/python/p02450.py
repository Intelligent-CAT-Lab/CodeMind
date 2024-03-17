<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
from itertools import permutations

def main():
    n = int(input())
    str = ""

    for i in range(1, n+1):
        str += str(i)

    permute(str)

def permute(s):
    perms = [''.join(p) for p in permutations(s)]
    for p in perms:
        print(p)

if __name__ == "__main__":
    main()
```

This Python code uses the `itertools.permutations` function to generate all permutations of the input string. The `main` function reads the input number, converts it to a string, and passes it to the `permute` function. The `permute` function generates all permutations and prints them.
<|EOT|>
