<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02667 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] T = sc.next().toCharArray();
		int N = T.length;
		
		int oneSum = 0;
		ArrayList<Integer> indexes = new ArrayList<>();
		for(int i=0; i<N; i++) {
			if(T[i]=='1') {
				int length = 0;
				for(int j=i; j<N; j++) {
					if(T[j]=='1')
						length++;
					else
						break;
				}
				if(length%2==1) {
					indexes.add(i-(oneSum-indexes.size()));
				}
				oneSum += length;
				i += length;
			}
		}
		
		long zeroSum = N-oneSum;
		long ans = (zeroSum+1)*(oneSum-indexes.size())/2;
		
		for(int i=0; i<indexes.size(); i++) {
			int index = indexes.get(i);
			ans += zeroSum+1 - (index-i+(1+i%2))/2;
		}
		
		for(int i=oneSum-1; i>=1; i--) {
			ans += (i+1)/2;
		}
		
		System.out.println(ans);
		sc.close();
	}

}


```

### Response:
```python
import sys

def main():
    T = list(sys.stdin.readline().strip())
    N = len(T)

    oneSum = 0
    indexes = []
    for i in range(N):
        if T[i] == '1':
            length = 0
            for j in range(i, N):
                if T[j] == '1':
                    length += 1
                else:
                    break
            if length % 2 == 1:
                indexes.append(i - (oneSum - len(indexes)))
            oneSum += length
            i += length - 1

    zeroSum = N - oneSum
    ans = (zeroSum + 1) * (oneSum - len(indexes)) // 2

    for i in range(len(indexes)):
        index = indexes[i]
        ans += zeroSum + 1 - (index - i + (1 + i % 2)) // 2

    for i in range(oneSum - 1, 0, -1):
        ans += (i + 1) // 2

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the number of '1's and '0's, and calculates the answer based on the number of '1's and '0's. The result is printed to the standard output.
<|EOT|>
