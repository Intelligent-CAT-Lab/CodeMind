<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
def solve():
    N, A, B, C, D = map(int, input().split())

    for i in range(N):
        max_val = D * (N - 1 - i) - C * i
        min_val = C * (N - 1 - i) - D * i
        if min_val <= abs(B - A) <= max_val:
            print("YES")
            return
    print("NO")

solve()
```

This Python code reads the input from the user, which is a list of 5 integers. It then checks each value of the list against a range of values calculated using the formula provided in the Java code. If the absolute difference between the values of B and A falls within this range, it prints "YES" and returns. If no such value is found after checking all values, it prints "NO".
<|EOT|>
