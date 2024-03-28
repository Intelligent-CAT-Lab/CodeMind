<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoderregularcontest

Expected output:
b


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
def find_missing_letter(s):
    count = [0]*26
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    for char in s:
        count[alphabet.index(char)] += 1
    for i in range(26):
        if count[i] == 0:
            return alphabet[i]
    return "None"

print(find_missing_letter(input()))
```

This Python code does the same thing as the Java code. It counts the occurrence of each letter in the input string and then checks which letter is missing. If all letters are present, it returns "None".
<|EOT|>
