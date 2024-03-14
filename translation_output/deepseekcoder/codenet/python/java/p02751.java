<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n,m=map(int,input().split())
ans=[["1"]*(2**m-1) for _ in range(2**n-1)]
for k in range(1,11):
    for i in range(2**k,2**n,2**k):
        for j in range(2**k,2**m,2**k):
            if ans[i-1][j-1]=="1":
                ans[i-1][j-1]="0"
            else:
                ans[i-1][j-1]="1"
for i in range(2**n-1):
    print("".join(ans[i]))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[][] ans = new String[(int)Math.pow(2, n) - 1][(int)Math.pow(2, m) - 1];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = "1";
            }
        }

        for (int k = 1; k < 11; k++) {
            for (int i = (int)Math.pow(2, k); i < Math.pow(2, n); i+= Math.pow(2, k)) {
                for (int j = (int)Math.pow(2, k); j < Math.pow(2, m); j+= Math.pow(2, k)) {
                    if (ans[i - 1][j - 1].equals("1")) {
                        ans[i - 1][j - 1] = "0";
                    } else {
                        ans[i - 1][j - 1] = "1";
                    }
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `m` from the input, creates a 2D array of strings with size `2^n - 1` by `2^m - 1`, and initializes all elements to "1". Then it iterates over the array and flips the value of each element if its index is a power of 2. Finally, it prints the array.
<|EOT|>
