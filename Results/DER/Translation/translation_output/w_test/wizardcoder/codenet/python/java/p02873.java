Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
<>>

Expected output:
3


```
from sys import stdin
S = str(stdin.readline().rstrip())
#l = list(map(int, stdin.readline().rstrip().split()))
#A, B, C = map(int, stdin.readline().rstrip().split())
#S = [list(map(int, stdin.readline().rstrip().split())) for _ in range(h)]#hã®å®ç¾©ãå¿ããã«

n = len(S)+1
sho = [0]*n
dai = [0]*n

for i,s in enumerate(S):
    i += 1
    if s ==">":
        sho[i] = 0
    else:
        sho[i] = sho[i-1] + 1

for i,s in enumerate(S[::-1]):
    i = n-i-2
    if s == "<":
        dai[i]=0
    else:
        dai[i] = dai[i+1] +1

seq = [max(x,y) for x,y in zip(sho,dai)]

print(sum(seq))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().trim();
        int n = S.length()+1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for(int i=1; i<n; i++){
            if(S.charAt(i-1) == '>'){
                sho[i] = 0;
            }else{
                sho[i] = sho[i-1] + 1;
            }
        }

        for(int i=n-2; i>=0; i--){
            if(S.charAt(i) == '<'){
                dai[i] = 0;
            }else{
                dai[i] = dai[i+1] + 1;
            }
        }

        int[] seq = new int[n];
        for(int i=0; i<n; i++){
            seq[i] = Math.max(sho[i], dai[i]);
        }

        int sum = 0;
        for(int i=0; i<n; i++){
            sum += seq[i];
        }

        System.out.println(sum);
    }
}
```<|endoftext|>
