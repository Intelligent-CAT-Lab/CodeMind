<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] num = new int[10][10];
        for(int i = 1; i <= N; i++){
            if(i % 10 > 0)
                num[i/10][i%10]++;
        }
        int c = 0;
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                c += num[i][j]*num[j][i];
            }
        }
        System.out.println(c);
    }
}
```
<|endoftext|>
