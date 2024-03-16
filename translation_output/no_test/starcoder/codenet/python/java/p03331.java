<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```

import sys
def input():
	return sys.stdin.readline().strip()

N = int(input())

def sum_N(N):
	total = 0
	x = N
	while x > 0:
		total += x % 10
		x = x // 10
	return total

ans = 1000000000000
for i in range(1, N):
	ans = min(ans, sum_N(i) + sum_N(N - i))

print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 1000000000000;
		for(int i = 1; i <= N; i++){
			int sum1 = 0, sum2 = 0;
			int x = i;
			while(x > 0){
				sum1 += x % 10;
				x = x / 10;
			}
			x = N - i;
			while(x > 0){
				sum2 += x % 10;
				x = x / 10;
			}
			ans = Math.min(ans, sum1 + sum2);
		}
		System.out.println(ans);
	}
}
```
<|endoftext|>
