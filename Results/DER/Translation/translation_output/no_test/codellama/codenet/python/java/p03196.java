<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,p=map(int,input().split())

def factorization(n):
    arr = []
    temp = n
    for i in range(2, int(-(-n**0.5//1))+1):
        if temp%i==0:
            cnt=0
            while temp%i==0:
                cnt+=1
                temp //= i
            arr.append([i, cnt])

    if temp!=1:
        arr.append([temp, 1])

    if arr==[]:
        arr.append([n, 1])

    return arr

l=factorization(p)
ans=1
for i in range(len(l)):
    if l[i][1]>=n:
        ans*=l[i][0]**(l[i][1]//n)
print(ans)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        int[][] factorization = factorize(p);
        int ans = 1;
        for (int i = 0; i < factorization.length; i++) {
            if (factorization[i][1] >= n) {
                ans *= factorization[i][0] ^ (factorization[i][1] / n);
            }
        }
        System.out.println(ans);
    }

    public static int[][] factorize(int n) {
        int[][] arr = new int[n][2];
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr[i] = new int[] { i, cnt };
            }
        }
        if (temp != 1) {
            arr[temp] = new int[] { temp, 1 };
        }
        if (arr.length == 0) {
            arr[n] = new int[] { n, 1 };
        }
        return arr;
    }
}
```
Note that the `factorize` method in Java is similar to the `factorization` function in Python, but it returns an array of arrays, where each subarray contains the prime factor and its exponent. The `main` method in Java is similar to the `factorization` function in Python, but it takes input from the user and prints the result to the console.</s>
