<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
5
4
1
0


```
n,x,y = [int(n) for n in input().split()]


ans = [0] * (n-1)

for i in range(n-1):
    for j in range(i+1,n):
        a=j-i
        b=abs((y-1)-j)+abs(i-(x-1))+1
        ans[min(a,b)-1]+=1
for i in ans:
	print(i)        

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] ans = new int[n-1];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int a = j-i;
                int b = Math.abs((y-1)-j)+Math.abs(i-(x-1))+1;
                ans[Math.min(a,b)-1]++;
            }
        }
        for(int i=0;i<n-1;i++){
            System.out.println(ans[i]);
        }
    }
}
```
<|endoftext|>
