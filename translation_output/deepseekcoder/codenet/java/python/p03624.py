<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p03624 {

	public static void main(String[] args) {
		Scanner sc 	   = new Scanner(System.in);
		String 	string = sc.next();
		int i=0;	boolean isNOTfound=false;
		
		int[]  count = new int[26];
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
						  'o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] chars    = string.toCharArray();
		for(i=0;i<chars.length;i++) 
			count[chars[i]-97] ++; 
		for(i=0;i<count.length;i++)
			if(count[i]==0) { isNOTfound = true; break; }
		if(isNOTfound)	System.out.println(alphabet[i]); 
		else 			System.out.println("None");
	}

}

```

### Response:
```python
import sys

def main():
    string = sys.stdin.readline().strip()
    count = [0]*26
    alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n',
               'o','p','q','r','s','t','u','v','w','x','y','z']
    for ch in string:
        count[ord(ch)-97] += 1
    for i in range(26):
        if count[i]==0: 
            print(alphabet[i])
            return
    print("None")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from standard input, counts the occurrences of each character in the string, and then prints the first character that does not appear in the string (in alphabetical order) or "None" if all characters appear in the string.
<|EOT|>
