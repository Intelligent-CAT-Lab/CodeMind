<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
47

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

@@ Response
```python
import heapq

def min_cost(K):
    dp = [float('inf')] * K
    dp[0] = 0
    heap = [(0, 0)]
    while heap:
        cost, v = heapq.heappop(heap)
        if cost > dp[v]:
            continue
        for i in range(10):
            nextv = (v * 10 + i) % K
            nextc = cost + i
            if dp[nextv] > nextc:
                dp[nextv] = nextc
                heapq.heappush(heap, (nextc, nextv))
    return dp[0]

K = int(input())
print(min_cost(K))
```

This Python code does the same thing as the Java code. It uses a priority queue to keep track of the nodes to be processed, and it updates the minimum cost to reach each number modulo K. The `heapq` module in Python provides an implementation of the heap queue algorithm, also known as the priority queue algorithm.<｜end▁of▁sentence｜>
