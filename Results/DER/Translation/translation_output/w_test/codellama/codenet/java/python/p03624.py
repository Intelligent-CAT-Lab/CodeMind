<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    string = sys.stdin.readline().strip()
    count = [0] * 26
    alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    for char in string:
        count[ord(char) - 97] += 1
    for i in range(len(count)):
        if count[i] == 0:
            print(alphabet[i])
            return
    print("None")

if __name__ == "__main__":
    main()
```
Note that the `ord()` function is used to get the ASCII value of a character, and the `-97` is used to convert the ASCII value to an index in the `count` array.
Also, the `strip()` method is used to remove any trailing newline characters from the input string.</s>
