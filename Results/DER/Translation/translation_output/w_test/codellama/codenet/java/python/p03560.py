<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
3


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
[/INST]

Here is the Python code that implements the same logic as the Java code:
```python
import heapq

def main():
    K = int(input())
    dp = [float('inf')] * K
    dp[0] = 0
    que = [(0, 0)]
    while que:
        v, c = heapq.heappop(que)
        if c > dp[v]:
            continue
        for i in range(10):
            nextv = (v * 10 + i) % K
            nextc = c + i
            if dp[nextv] > nextc:
                dp[nextv] = nextc
                heapq.heappush(que, (nextv, nextc))
    print(dp[0])

if __name__ == '__main__':
    main()
```
Note that the Python code uses the `heapq` module to implement the priority queue, which is a more efficient and Pythonic way of implementing a priority queue than using a `PriorityQueue` object from the `java.util` package.</s>
