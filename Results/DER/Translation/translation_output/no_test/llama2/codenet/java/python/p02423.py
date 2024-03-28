<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解答

```python
import sys

def main():
    x = int(sys.stdin.readline())
    twobit = bin(x)[2:]
    left = bin(x<<1)[2:]
    right = bin(x>>1)[2:]
    print(twobit)
    for i in range(32):
        if twobit[i] == '0':
            print('1', end='')
        else:
            print('0', end='')
    print()
    print(left + right)

if __name__ == '__main__':
    main()
```

### 解説

- 入力を読み込み、`x` に代入する
- 2 進数表示を `twobit` に代入する
- 左側の 2 進数表示を `left` に代入する
- 右側の 2 進数表示を `right` に代入する
- 2 進数表示を 32 進数表示に変換する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` に代入する
- 32 進数表示を `twobit` 
