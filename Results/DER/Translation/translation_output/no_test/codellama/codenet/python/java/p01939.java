<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

MOD = 10**9+7

def sum(a,d,n):
    return n*(2*a+(n-1)*d)//2

def main():
    n,m = map(int,input().split())

    s = 0
    if n == 1:
        s = m+1
    else:
        s = sum(m+1,-n+1,1+m//(n-1))
        s *= 2
        s -= (m+1)

    print(s%MOD)

if __name__ == '__main__':
    main()

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int MOD = 1000000007;

        int s = 0;
        if (n == 1) {
            s = m + 1;
        } else {
            s = sum(m + 1, -n + 1, 1 + m / (n - 1));
            s *= 2;
            s -= (m + 1);
        }

        System.out.println(s % MOD);
    }

    public static int sum(int a, int d, int n) {
        return n * (2 * a + (n - 1) * d) / 2;
    }
}
```
This is the Java code equivalent to the Python code you provided. It uses the `Scanner` class to read input from the user, and the `sum` function is defined as a separate method. The `MOD` variable is defined as a constant to avoid repetition. The `main` method is the entry point of the program, and it reads the input from the user, calculates the sum, and prints the result.</s>
