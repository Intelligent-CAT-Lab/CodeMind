<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 24

Expected output:
2


```
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

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[][] arr = factorization(p);
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] >= n) {
                ans *= Math.pow(arr[i][0], arr[i][1] / n);
            }
        }
        System.out.println(ans);
    }

    public static int[][] factorization(int n) {
        int[][] arr = new int[n][2];
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr[i][0] = i;
                arr[i][1] = cnt;
            }
        }
        if (temp != 1) {
            arr[temp][0] = temp;
            arr[temp][1] = 1;
        }
        return arr;
    }
}
```
This is the Java code for the given Python code. The `factorization` function is implemented in Java using the same logic as the Python code. The `main` function takes input from the user and calls the `factorization` function to get the factorization of the input number. The `ans` variable is then calculated using the same logic as the Python code. Finally, the `ans` variable is printed to the console.</s>
