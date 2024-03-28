<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class p03560{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int[] dp = new int[K];
        Arrays.fill(dp,Integer.MAX_VALUE);

        class Node{
            int to,cost;
            Node(int to,int cost){
                this.to=to;
                this.cost=cost;
            }
        }

        PriorityQueue<Node> que = new PriorityQueue<>((a,b) -> a.cost-b.cost);
        for(int i=1;i<Math.min(10,K);++i){
            dp[i]=i;
            que.add(new Node(i,i));
        }
        while(!que.isEmpty()){
            Node node = que.poll();
            int v = node.to;
            int c = node.cost;
            if(c > dp[v])continue;
            for(int i=0;i<10;++i){
                int nextv = (v*10+i)%K;
                int nextc = c+i;
                if(dp[nextv] > nextc){
                    dp[nextv]=nextc;
                    que.add(new Node(nextv,nextc));
                }
            }
        }
        System.out.println(dp[0]);
    }
}
```

### 解题思路

```
dp[i] = 0;
for(int j=1;j<10;++j){
    dp[i] = Math.min(dp[i],dp[i*10+j]);
}
```

### 代码实现

```python
import sys

def p03560():
    K = int(sys.stdin.readline())
    dp = [int(sys.stdin.readline()) for _ in range(K)]
    dp[0] = 0
    for i in range(1,10):
        for j in range(1,10):
            dp[i] = min(dp[i],dp[i*10+j])
    print(dp[0])

if __name__ == '__main__':
    p03560()
```
</s>
