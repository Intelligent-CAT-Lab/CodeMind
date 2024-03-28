<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
RRLRL

Expected output:
0 1 2 1 1 -19

```
import java.io.*;
import java.math.*;
import java.util.*;
public class p02954 {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String S = input.next();
		int N = S.length();
		int[] ans = new int[N];
		int curIndex = 0;
		while (curIndex < N) {
			int numLeft = 0;
			int numRight = 0;
			while (S.charAt(curIndex)=='R') {
				numRight++;
				curIndex++;
				if (curIndex==N) break;
			}
			//curIndex--; //After last ever L/R, curIndex is incremented which causes array 
			//out of bounds
			int R = curIndex-1;
			while (S.charAt(curIndex)=='L') {
				numLeft++;
				curIndex++;
				if (curIndex==N) break;
			}
			int left = numLeft;
			int right = numRight;
			if ((left+right)%2==0) { //Children cascade into adjacent numbers as close to 
				//each other as possible
				int sum = left+right;
				left=sum/2;
				right=sum/2;
			}else {
				int sum = left+right;
				if (right%2==1) { //The greater number is given to the R/L count with odd parity
					right=sum/2;
					left=sum-right;
				}else {
					left=sum/2;
					right=sum-left;
				}
			}
			ans[R]=left;
			ans[R+1]=right; //Children moving swaps squares 
			if (curIndex==N-1) break;
		}
		for (int i = 0; i < N; i++)
			System.out.print(ans[i]+" ");
	}
}
```

### Response:
```python
def solve(S):
    N = len(S)
    ans = [0]*N
    curIndex = 0
    while curIndex < N:
        numLeft = 0
        numRight = 0
        while curIndex < N and S[curIndex]=='R':
            numRight += 1
            curIndex += 1
        R = curIndex - 1
        while curIndex < N and S[curIndex]=='L':
            numLeft += 1
            curIndex += 1
        left = numLeft
        right = numRight
        if (left+right)%2==0:
            left = (left+right)//2
            right = (left+right)//2
        else:
            if right%2==1:
                right = (left+right)//2
                left = (left+right) - right
            else:
                left = (left+right)//2
                right = (left+right) - left
        ans[R] = left
        ans[R+1] = right
    return ans

S = input()
print(*solve(S))
```

This Python code does the same thing as the Java code. It reads a string `S` from the input, and then it processes `S` to calculate the answer. The answer is a list of integers, which is then printed to the output.
<|EOT|>
