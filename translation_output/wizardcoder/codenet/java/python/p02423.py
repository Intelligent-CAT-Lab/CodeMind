Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
		if (a!= 0)	for (int i=0; i<a; i++)	s = '0' + s;
		if (a < 0) s = s.substring(s.length()-32);
		return s;
	}
}

```

### Response:
```python
import java.util.Scanner;

class p02423:

    @staticmethod
    def main(args):
        with Scanner(System.in) as sc:
            x = sc.nextLong()
            twobit = Long.toBinaryString(x)
            left = Long.toBinaryString(x<<1)  #å·¦ã·ãã
            right = Long.toBinaryString(x>>1)  #å³ã·ãã
            twobit = p02423.to32(twobit)
            left = p02423.to32(left)
            right = p02423.to32(right)
            print(twobit)
            for i in range(32):
                if twobit[i] == '0':
                    print('1', end='')
                else:
                    print('0', end='')
            print()
            print(left + '\n' + right)

    #æ¡æ°ã32ã«ãã
    @staticmethod
    def to32(s):
        a = 32-len(s)
        if a!= 0:
            for i in range(a):
                s = '0' + s
        if a < 0:
            s = s[-32:]
        return s

if __name__ == '__main__':
    p02423.main(None)
```<|endoftext|>
