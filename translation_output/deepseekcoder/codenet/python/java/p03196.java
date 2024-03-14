<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        List<int[]> list = factorization(p);
        int ans = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[1] >= n) {
                ans *= Math.pow(list.get(i)[0], list.get(i)[1] / n);
            }
        }
        System.out.println(ans);
    }

    public static List<int[]> factorization(int n) {
        List<int[]> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(new int[]{i, cnt});
            }
        }

        if (temp != 1) {
            arr.add(new int[]{temp, 1});
        }

        if (arr.isEmpty()) {
            arr.add(new int[]{n, 1});
        }

        return arr;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the factorization of the second number, and then calculates the answer based on the factorization. The factorization is done using the `factorization` method, which returns a list of arrays, where each array contains a prime number and its count in the factorization. The `main` method reads the input, calls `factorization`, and then calculates the answer.
<|EOT|>
