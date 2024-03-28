Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 1 5 2 4

Expected output:
YES


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
import math

class p03666:
    def solve(self):
        N = int(input())
        A = int(input())
        B = int(input())
        C = int(input())
        D = int(input())

        for i in range(N):
            max_val = D * (N - 1 - i) - C * i
            min_val = C * (N - 1 - i) - D * i
            if abs(B - A) >= min_val and abs(B - A) <= max_val:
                print("YES")
                return

        print("NO")

p03666().solve()
```

Explanation:

We first import the math module to use the `abs()` function. We then define a class `p03666` which has a method `solve()` which takes input from the user and solves the problem.

We first read the input values `N`, `A`, `B`, `C`, and `D` from the user using the `input()` function.

We then loop through all the values of `i` from 0 to `N-1`. For each value of `i`, we calculate the maximum and minimum values that can be achieved using the given values of `N`, `A`, `B`, `C`, and `D`. We then check if the absolute difference between `B` and `A` is greater than or equal to the minimum value and less than or equal to the maximum value. If it is, we print "YES" and return from the function. If we have looped through all the values of `i` and have not found a solution, we print "NO".<|endoftext|>
