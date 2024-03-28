<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 7

Expected output:
4


```

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		long x = sc.nextLong();

		System.out.println(calc(n, x));
	}


	static long calc(int n, long x){
		if(n == 0)
			return 1;
		long sum = 0;
		x--;
		long length = length(n-1);
		long p = p(n-1);
		if(x > 0){
			if(length <= x)
				sum += p;
			else
				sum += calc(n-1, x);
			x -= length;
		}
		if(x > 0){
			x--;
			sum++;
		}
		if(x > 0){
			if(length <= x)
				sum += p;
			else
				sum += calc(n-1, x);
		}

		return sum;
	}

	static long length(int n){
		return 1 + 4 * ((long)Math.pow(2, n) -1);
	}

	static long p(int n){
		return 1 +2 * ((long)Math.pow(2, n) -1);
	}
}

class Scanner {
	private static final int SPACE = (int)' ';
	private static final int LINE_END_0 = 13;
	private static final int LINE_END_1 = 10;
	private static final int BEFORE = -1;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public String next(){
		StringBuilder sb = new StringBuilder();
		
		int length = BEFORE;
		readLoop: while(true) {
			try {
				int value = br.read();
				switch(value) {
				case LINE_END_1:
					if(length == BEFORE)
						break;
					
					if((int)sb.charAt(length) == LINE_END_0)
						sb.deleteCharAt(length);
				case SPACE:
					break readLoop;
				}
				sb.append((char)value);
				length++;

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	public String[] nextArray(int length) {
		String[] array = new String[length];
		for(int i = 0; i < length; i++)
			array[i] = next();
		return array;
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	
	public double[] nextDoubleArray(int length) {
		double[] array = new double[length];
		for(int i = 0; i < length; i++)
			array[i] = nextDouble();
		return array;
	}
	
	public int nextInt() {
		return Integer.parseInt(next());
	}
	
	public int[] nextIntArray(int length) {
		int[] array = new int[length];
		for(int i = 0; i < length; i++)
			array[i] = nextInt();
		return array;
	}
	
	public long nextLong() {
		return Long.parseLong(next());
	}
	
	public long[] nextLongArray(int length) {
		long[] array = new long[length];
		for(int i = 0; i < length; i++)
			array[i] = nextLong();
		return array;
	}
	
	public boolean ready() {
		try {
			return br.ready();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}

```

### Response:
```python
def calc(n, x):
    if n == 0:
        return 1
    sum = 0
    x -= 1
    length = length(n-1)
    p = p(n-1)
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n-1, x)
        x -= length
    if x > 0:
        x -= 1
        sum += 1
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n-1, x)
    return sum

def length(n):
    return 1 + 4 * ((2 ** n) -1)

def p(n):
    return 1 + 2 * ((2 ** n) -1)

def main():
    n, x = map(int, input().split())
    print(calc(n, x))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the provided Java code. It reads two integers from the input, calculates the result using the `calc` function, and then prints the result. The `calc` function is a recursive function that calculates the result based on the input parameters. The `length` and `p` functions are helper functions that calculate the length and p values respectively. The main function is the entry point of the program.
<|EOT|>
