<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
Here is the equivalent Python code:

```python
def to32(s):
    a = 32 - len(s)
    if a != 0:
        s = '0' * a + s
    if a < 0:
        s = s[-32:]
    return s

x = int(input())
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
```

This Python code does the same thing as the Java code. It reads an integer from the user, converts it to binary, shifts it left and right, and then prints the results. The `to32` function is used to ensure that the binary strings are 32 characters long.<｜end▁of▁sentence｜>
