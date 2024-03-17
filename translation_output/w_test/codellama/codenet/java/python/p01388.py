<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
KUPCkupcKUPC

Expected output:
2


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
[/INST]
```
import sys

def run():
    s = sys.stdin.readline().strip()
    c = [0, 0, 0, 0]
    for i in range(len(s)):
        if s[i] == 'K':
            c[0] += 1
        elif s[i] == 'U':
            c[1] += 1
        elif s[i] == 'P':
            c[2] += 1
        elif s[i] == 'C':
            c[3] += 1
    print(min(c))

if __name__ == '__main__':
    run()
```
This is a Python implementation of the Java code you provided. It uses the `sys` module to read input from stdin and the `min` function to find the minimum value in the `c` list.

Here's an example of how you can test this code:
```
$ python3 test.py
KUPCkupcKUPC
2
```
This will run the `run` function and print the result to the console.</s>
