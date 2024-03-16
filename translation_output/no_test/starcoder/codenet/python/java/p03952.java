<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N, x = [int(i) for i in input().split()]
import sys

if x == 1 or x == 2*N-1:
    if N!= 1:
        print('No')
        sys.exit()
    else:
        print('Yes')
        print(1)
        sys.exit()

smaller = True
if x > N:
    smaller = False
    x = 2*N-x

ans = list(range(2*N-1,N+x-1,-1))+list(range(1,N+x))
if not smaller:
    ans =[2*N - ans[i] for i in range(2*N-1)]

print('Yes')
for i in range(2*N-1):
    print(ans[i])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        if(x == 1 || x == 2*N-1){
            if(N!= 1){
                System.out.println("No");
                return;
            }
            else{
                System.out.println("Yes");
                System.out.println(1);
                return;
            }
        }
        boolean smaller = true;
        if(x > N){
            smaller = false;
            x = 2*N-x;
        }
        int[] ans = new int[2*N-1];
        for(int i = 0; i < 2*N-1; i++){
            if(i < N+x-1){
                ans[i] = i+1;
            }
            else{
                ans[i] = 2*N-1-i;
            }
        }
        if(!smaller){
            for(int i = 0; i < 2*N-1; i++){
                ans[i] = 2*N-1-ans[i];
            }
        }
        System.out.println("Yes");
        for(int i = 0; i < 2*N-1; i++){
            System.out.println(ans[i]);
        }
    }
}
```
<|endoftext|>
