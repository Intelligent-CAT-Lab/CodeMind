<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 1 5 2 4

Expected output:
YEp

```
import java.util.Scanner;

public class p03666 {

	public static void main(String[] args) {
		new p03666().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		long D=sc.nextLong();
		
		for(int i=0;i<=N-1;i++){
			long max=D*(N-1-i)-C*i;
			long min=C*(N-1-i)-D*i;
			if(Math.abs(B-A)>=min && Math.abs(B-A)<=max){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}

```
[/INST]
```python
N = int(input())
A, B, C, D = map(int, input().split())

for i in range(N):
    max = (D * (N - 1 - i) - C * i)
    min = (C * (N - 1 - i) - D * i)
    if abs(B - A) >= min and abs(B - A) <= max:
        print("YES")
        break
else:
    print("NO")
```</s>
