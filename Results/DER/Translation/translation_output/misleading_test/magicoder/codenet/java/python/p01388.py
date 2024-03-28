<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
KUPCkupcKUPC

Expected output:
-65

```
import  java.util.Scanner;

public class p01388 {
	
	void run(){
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int[] c = new int[4];
		for(int i=0;i<s.length;i++) {
			if(s[i]=='K')c[0]++;
			if(s[i]=='U')c[1]++;
			if(s[i]=='P')c[2]++;
			if(s[i]=='C')c[3]++;
		}
		System.out.println(Math.min(c[0], Math.min(c[1], Math.min(c[2], c[3]))));
	}

	public static void main(String[] args) {
		new p01388().run();
	}

}


```

@@ Response
Here is the Python version of the given Java code:

```python
def run():
    s = input()
    c = [0, 0, 0, 0]
    for i in s:
        if i == 'K':
            c[0] += 1
        if i == 'U':
            c[1] += 1
        if i == 'P':
            c[2] += 1
        if i == 'C':
            c[3] += 1
    print(min(c))

if __name__ == "__main__":
    run()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the occurrences of 'K', 'U', 'P', and 'C', and then prints the minimum count.<｜end▁of▁sentence｜>
