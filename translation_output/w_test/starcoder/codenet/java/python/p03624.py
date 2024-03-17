<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python

import sys

def main():
	string = sys.stdin.readline().strip()
	count = [0]*26
	alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n',
				'o','p','q','r','s','t','u','v','w','x','y','z']
	for i in string:
		count[ord(i)-97] += 1
	for i in range(26):
		if count[i] == 0:
			print(alphabet[i])
			return
	print("None")

if __name__ == "__main__":
	main()

```
<|endoftext|>
