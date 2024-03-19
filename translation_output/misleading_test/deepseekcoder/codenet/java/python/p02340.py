<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 3

Expected output:
61

```
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02340 {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static final int SIZE = 1005;
	public static long dp[][];

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);

		dp = new long[SIZE][SIZE];

		for(int i = 0; i < SIZE; i++){
			for(int k = 0; k < SIZE; k++){

				dp[i][k] = -1;
			}
		}

		int num_ball = scanner.nextInt();
		int num_box = scanner.nextInt();

		System.out.println(recursive(num_ball,num_box));
    }

	public static long recursive(int num_ball,int num_box){

		if(dp[num_ball][num_box] != -1){

			return dp[num_ball][num_box];
		}

		if(num_ball == 0){

			return 1;
		}else if(num_box == 1){

			return 1;
		}

		long ret = 0;

		for(int next_box = 1; next_box <= num_box; next_box++){
			int next_ball = num_ball-next_box;
			if(next_ball < 0)break;

			ret += recursive(next_ball,next_box);
			ret %= MOD;
		}

		return dp[num_ball][num_box] = ret;
	}
}

class UTIL{

	//æå¤§å¬ç´æ°
	public static long gcd(long x,long y){

		x = Math.abs(x);
		y = Math.abs(y);

		if(x < y){

			long tmp = y;
			y = x;
			x = tmp;
		}

		if(y == 0){

			return x;
		}else{

			return gcd(y,x%y);
		}
	}

	//æå°å¬åæ°
	public static long lcm(long x,long y){

		return (x*y)/gcd(x,y);
	}

	//Stringâintã¸å¤æ
    public static int getNUM(String tmp_str){

        return Integer.parseInt(tmp_str);
    }

    //æå­ãåè§æ°å­ãå¤å®ããé¢æ°
    public static boolean isNumber(String tmp_str){

        if(tmp_str == null || tmp_str.length() == 0){

            return false;
        }

        Pattern pattern = Pattern.compile("\\A[0-9]+\\z");
        Matcher matcher = pattern.matcher(tmp_str);
        return matcher.matches();
    }
}

```

### Response:
```python
import sys

MOD = 1000000007
SIZE = 1005
dp = [[0 for _ in range(SIZE)] for _ in range(SIZE)]

def recursive(num_ball, num_box):
    global dp

    if dp[num_ball][num_box] != -1:
        return dp[num_ball][num_box]

    if num_ball == 0:
        return 1
    elif num_box == 1:
        return 1

    ret = 0

    for next_box in range(1, num_box + 1):
        next_ball = num_ball - next_box
        if next_ball < 0:
            break

        ret += recursive(next_ball, next_box)
        ret %= MOD

    dp[num_ball][num_box] = ret
    return ret

def main():
    global dp

    for i in range(SIZE):
        for k in range(SIZE):
            dp[i][k] = -1

    num_ball, num_box = map(int, sys.stdin.readline().split())
    print(recursive(num_ball, num_box))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then prints the result of the `recursive` function. The `recursive` function is a dynamic programming function that calculates the number of ways to distribute `num_ball` balls into `num_box` boxes. The result is stored in the `dp` array to avoid redundant calculations.
<|EOT|>
