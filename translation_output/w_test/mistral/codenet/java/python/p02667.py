<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1101

Expected output:
5


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
[/INST]
```python
def p02667():
    T = input()
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
            i += length
        else:
            zeroSum = N - oneSum
            ans = (zeroSum + 1) * (oneSum - len(indexes)) // 2
            for i in range(len(indexes)):
                index = indexes[i]
                ans += zeroSum + 1 - (index - i + (1 + i % 2)) // 2
            for i in range(oneSum - 1, 1, -1):
                ans += (i + 1) // 2
            print(ans)

p02667()
```</s>
