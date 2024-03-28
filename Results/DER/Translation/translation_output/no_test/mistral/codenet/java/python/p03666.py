<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

class p03666:
    def solve(self):
        N = int(input())
        A = long(input())
        B = long(input())
        C = long(input())
        D = long(input())
        for i in range(N):
            max = D * (N - 1 - i) - C * i
            min = C * (N - 1 - i) - D * i
            if abs(B - A) >= min and abs(B - A) <= max:
                print("YES")
                return
        print("NO")

if __name__ == "__main__":
    p03666().solve()
```</s>
