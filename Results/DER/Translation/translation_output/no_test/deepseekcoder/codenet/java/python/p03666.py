<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

class p03666:

    @staticmethod
    def main():
        p03666().solve()

    def solve(self):
        N = int(sys.stdin.readline())
        A, B, C, D = map(int, sys.stdin.readline().split())

        for i in range(N):
            max_val = D * (N - 1 - i) - C * i
            min_val = C * (N - 1 - i) - D * i
            if min_val <= abs(B - A) <= max_val:
                print("YES")
                return
        print("NO")

if __name__ == "__main__":
    p03666.main()
```

This Python code reads the input from the standard input (stdin) and checks if the absolute difference between B and A is within the range defined by the min and max values calculated in the Java code. If it is, it prints "YES" and returns. If it doesn't find a match after checking all the values, it prints "NO".
<|EOT|>
