<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
962
11111111111111111111111111110102
10097
116

```
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

```
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
    print(left + '\n' + right)

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
Note that the `to32` function is the same as the one in the Java code, and it is used to pad the binary strings to 32 characters. The `main` function reads the input from stdin, converts it to binary, shifts it left and right, and prints the results.</s>
