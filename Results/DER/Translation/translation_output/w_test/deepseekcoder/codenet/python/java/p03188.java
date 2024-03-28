<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
2
1 1 
2 2 

```
K=int(input())

if K<=500:
    print(K)
    for i in range(1,K+1):
        print((str(i)+" ")*K)

else:
    KUP=((K+1)//2+3)//4*4
    print(KUP)

    ANS=[[0]*KUP for i in range(KUP)]

    begin=0
    for i in range(KUP):
        for j in range(KUP):
            if i%2==0:
                ANS[i][(j+begin)%KUP]=j+1
            else:
                ANS[i][(j+begin)%KUP]=j+1+KUP
                
        begin+=1

    for i in range(KUP*2-K):

        for j in range(KUP):
            for l in range(KUP):
                if ANS[j][l]==KUP*2-i:
                    ANS[j][l]=KUP*2-i-KUP

    for ans in ANS:
        print(*ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        if (K <= 500) {
            System.out.println(K);
            for (int i = 1; i <= K; i++) {
                for (int j = 1; j <= K; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } else {
            int KUP = ((K + 1) / 2 + 3) / 4 * 4;
            System.out.println(KUP);

            int[][] ANS = new int[KUP][KUP];

            int begin = 0;
            for (int i = 0; i < KUP; i++) {
                for (int j = 0; j < KUP; j++) {
                    if (i % 2 == 0) {
                        ANS[i][(j + begin) % KUP] = j + 1;
                    } else {
                        ANS[i][(j + begin) % KUP] = j + 1 + KUP;
                    }
                }
                begin += 1;
            }

            for (int i = 0; i < KUP * 2 - K; i++) {
                for (int j = 0; j < KUP; j++) {
                    for (int l = 0; l < KUP; l++) {
                        if (ANS[j][l] == KUP * 2 - i) {
                            ANS[j][l] = KUP * 2 - i - KUP;
                        }
                    }
                }
            }

            for (int[] ans : ANS) {
                for (int num : ans) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, and if the integer is less than or equal to 500, it prints the integer and a square matrix of that size. If the integer is greater than 500, it prints a larger square matrix and fills it with numbers in a specific pattern.
<|EOT|>
