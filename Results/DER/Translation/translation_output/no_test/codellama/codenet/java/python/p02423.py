<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

class p02423 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			long x = sc.nextLong();
			String twobit = Long.toBinaryString(x);
			String left = Long.toBinaryString(x<<1);  //å·¦ã·ãã
			String right = Long.toBinaryString(x>>1);  //å³ã·ãã
			twobit = to32(twobit);
			left = to32(left);
			right = to32(right);
			System.out.println(twobit);
			for (int i=0; i<32; i++) {
				if (twobit.substring(i, i+1).equals("0")) System.out.print('1');
				else System.out.print('0');
			}
			System.out.print('\n');
			System.out.println(left + '\n' + right);
		}
	}


	//æ¡æ°ã32ã«ãã
	static String to32(String s) {
		int a = 32-s.length();
		if (a != 0)	for (int i=0; i<a; i++)	s = '0' + s;
		if (a < 0) s = s.substring(s.length()-32);
		return s;
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    x = int(sys.stdin.readline())
    twobit = bin(x)[2:]
    left = bin(x << 1)[2:]
    right = bin(x >> 1)[2:]
    twobit = to32(twobit)
    left = to32(left)
    right = to32(right)
    print(twobit)
    for i in range(32):
        if twobit[i] == '0':
            print('1', end='')
        else:
            print('0', end='')
    print()
    print(left)
    print(right)

def to32(s):
    a = 32 - len(s)
    if a != 0:
        for i in range(a):
            s = '0' + s
    if a < 0:
        s = s[len(s) - 32:]
    return s

if __name__ == '__main__':
    main()
```
This is the Python code equivalent to the Java code you provided. It uses the `bin()` function to convert the input integer to a binary string, and then uses the `to32()` function to pad the string to 32 characters. The `to32()` function is defined as a separate function in the Python code, but it is equivalent to the `to32()` method in the Java code. The rest of the code is similar in both languages, with the main difference being the use of `print()` instead of `System.out.println()` in Python.</s>
