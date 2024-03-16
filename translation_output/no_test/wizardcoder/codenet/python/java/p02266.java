Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
def func(c):
    global cnt
    cnt += {'_':0, '/':1, '\\':-1}[c]
    return cnt

cnt = 0
g = [[0, False]] + [[func(c), False] for c in input()]

gmax = g[0][0]
for i in range(1, len(g)):
    if g[i - 1][0] < g[i][0] <= gmax :
        g[i][1] = True
    gmax = max(gmax, g[i][0])

puddles = []
volume = 0
saface_level = None

for i in range(len(g) - 1, -1, -1):
    if saface_level!= None:
        volume += saface_level  - g[i][0]
        if saface_level == g[i][0]:
            puddles += [volume]
            saface_level = None
            volume = 0
    if saface_level == None and g[i][1]:
        saface_level = g[i][0] 

puddles = puddles[::-1]
print(sum(puddles))
print(len(puddles), *puddles)
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[][] g = new int[n+1][2];
        g[0][0] = 0;
        for(int i=1;i<=n;i++){
            g[i][0] = g[i-1][0] + (s[i-1]=='_'?0:s[i-1]=='/'?1:-1);
            g[i][1] = false;
        }
        int gmax = g[0][0];
        for(int i=1;i<=n;i++){
            if(g[i-1][0]<g[i][0] && g[i][0]<=gmax){
                g[i][1] = true;
            }
            gmax = Math.max(gmax, g[i][0]);
        }
        List<Integer> puddles = new ArrayList<>();
        int volume = 0;
        int saface_level = -1;
        for(int i=n;i>=1;i--){
            if(saface_level!=-1){
                volume += saface_level - g[i][0];
                if(saface_level==g[i][0]){
                    puddles.add(volume);
                    saface_level = -1;
                    volume = 0;
                }
            }
            if(saface_level==-1 && g[i][1]){
                saface_level = g[i][0];
            }
        }
        int sum = 0;
        for(int p : puddles){
            sum += p;
        }
        System.out.println(sum);
        System.out.println(puddles.size());
        for(int p : puddles){
            System.out.print(p+" ");
        }
    }
}
```<|endoftext|>
