<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15

Expected output:
-48

```
from collections import deque
K=int(input())
que=deque([1,2,3,4,5,6,7,8,9])
for i in range(K):
    a=que.popleft()
    if not a%10==0:
        que.append(a*10+a%10-1)
    que.append(a*10+a%10)
    if not a%10==9:
        que.append(a*10+a%10+1)
print(a)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        Deque<Integer> que=new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        que.add(7);
        que.add(8);
        que.add(9);
        for(int i=0;i<K;i++){
            int a=que.removeFirst();
            if(a%10!=0){
                que.add(a*10+a%10-1);
            }
            que.add(a*10+a%10);
            if(a%10!=9){
                que.add(a*10+a%10+1);
            }
        }
        System.out.println(a);
    }
}
```
<|endoftext|>
