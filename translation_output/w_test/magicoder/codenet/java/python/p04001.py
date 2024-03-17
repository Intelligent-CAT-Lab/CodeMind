<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
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

@@ Response
```python
def main():
    S = input()
    if len(S) == 1:
        print(S)
        return
    N = [int(x) for x in S]

    pattern_count = 1
    tmp_bit = ""
    for i in range(len(N)):
        if i > 0:
            pattern_count *= 2
            tmp_bit += "1"

    sum = 0
    for i in range(pattern_count):
        bin_str = bin(i)[2:]
        while len(bin_str) < len(tmp_bit):
            bin_str = "0" + bin_str
        add = str(N[0])
        for j in range(len(bin_str)):
            if bin_str[j] == '1':
                sum += int(add)
                add = ""
            add += str(N[j+1])
        if add:
            sum += int(add)
    print(sum)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string of digits, converts it to a list of integers, and then calculates the sum of all possible combinations of the digits. The combinations are represented as binary numbers, and each digit in the binary number corresponds to a digit in the original number. If the binary digit is 1, the corresponding digit in the original number is added to the sum. If the binary digit is 0, the corresponding digit in the original number is skipped. The sum of all combinations is then printed.<｜end▁of▁sentence｜>
