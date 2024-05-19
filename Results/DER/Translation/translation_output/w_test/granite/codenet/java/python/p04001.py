System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
125

Expected output:
176


```
import java.util.Scanner;

public class p04001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		if(S.length()==1) {
			System.out.println(S);
			System.exit(0);
		}
		int[] N = new int[S.length()];

		int patternCount = 1;
		String tmpBit = "";
		for(int i=0; i<N.length; i++) {
			N[i] = Integer.parseInt(String.valueOf(S.charAt(i)));
			if(i>0) {
				patternCount*=2;
				tmpBit = tmpBit + "1";
			}
		}

		long sum=0;
		for(int i=0; i<patternCount; i++) {
			String bin = Integer.toBinaryString(i);
			while(bin.length()<tmpBit.length()) {
				bin = "0" + bin;
			}
			String add = String.valueOf(N[0]);
			for(int j=0; j<bin.length(); j++) {
				if(bin.charAt(j)=='1') {
					sum+=Integer.parseInt(add);
					add = "";
				}
				add = add + N[j+1];
			}
			if(add.length()>0) {
				//System.out.printf("sum:%d + add:%s = ",sum, add);
				sum+=Long.parseLong(add);
				//System.out.println(sum);
			}
		}
		System.out.println(sum);

	}

}

```


Answer:
```python
import sys

def main():
    S = sys.stdin.readline().strip()
    if len(S) == 1:
        print(S)
        return
    N = [int(c) for c in S]
    pattern_count = 1
    tmp_bit = ""
    for i in range(len(N)):
        pattern_count *= 2
        if i > 0:
            tmp_bit += "1"
    sum = 0
    for i in range(pattern_count):
        bin = bin(i)[2:]
        while len(bin) < len(tmp_bit):
            bin = "0" + bin
        add = str(N[0])
        for j in range(len(bin)):
            if bin[j] == "1":
                sum += int(add)
                add = ""
            add += str(N[j + 1])
        if add:
            sum += int(add)
    print(sum)

if __name__ == "__main__":
    main()
```<|endoftext|>
