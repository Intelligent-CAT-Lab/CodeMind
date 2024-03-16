<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def to32(s):
    a = 32 - len(s)
    if a != 0:
        for i in range(a):
            s = '0' + s
    if a < 0:
        s = s[-32:]
    return s

def main():
    x = int(sys.stdin.readline())
    twobit = format(x, '032b')
    left = format(x<<1, '032b')
    right = format(x>>1, '032b')
    print(twobit)
    for i in range(32):
        if twobit[i] == '0':
            sys.stdout.write('1')
        else:
            sys.stdout.write('0')
    sys.stdout.write('\n')
    print(left + '\n' + right)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a long integer from standard input, converts it to binary, and prints the binary representation, the binary representation of left shift, and the binary representation of right shift. The binary representation is always 32 bits long. The binary representation of left shift is the binary representation of the number shifted left by one bit, and the binary representation of right shift is the binary representation of the number shifted right by one bit. The binary representation is printed in the same format as the Java code.
<|EOT|>
