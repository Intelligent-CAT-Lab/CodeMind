Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
-13

```
N=int(raw_input())

num = [[0 for i in range(10)] for j in range(10)]

for i in range(1,N+1):
    if i % 10 > 0:
        num[int(str(i)[0])][i % 10] += 1

#print num

c = 0
for i in range(1,10):
    for j in range(1,10):
        c += num[i][j]*num[j][i]
print c

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] num = new int[10][10];
        for(int i=1;i<=N;i++){
            if(i%10>0){
                num[Integer.parseInt(String.valueOf(i).charAt(0))][i%10]++;
            }
        }
        int c=0;
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                c+=num[i][j]*num[j][i];
            }
        }
        System.out.println(c);
    }
}
```<|endoftext|>
