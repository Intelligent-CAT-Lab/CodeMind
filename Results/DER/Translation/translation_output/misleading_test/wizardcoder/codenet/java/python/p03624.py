Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.Scanner;

public class p03624 {

	public static void main(String[] args) {
		Scanner sc 	   = new Scanner(System.in);
		String 	string = sc.next();
		int i=0;	boolean isNOTfound=False;
		
		int[]  count = new int[26];
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
						  'o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] chars    = string.toCharArray();
		for(i=0;i<chars.length;i++) 
			count[chars[i]-97] ++; 
		for(i=0;i<count.length;i++)
			if(count[i]==0) { isNOTfound = True; break; }
		if(isNOTfound)	System.out.println(alphabet[i]); 
		else 			System.out.println("None");
	}

}
```<|endoftext|>
