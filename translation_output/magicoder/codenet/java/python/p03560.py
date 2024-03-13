<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    K = int(input())
    dp = [float('inf')] * K
    dp[0] = 0

    class Node:
        def __init__(self, to, cost):
            self.to = to
            self.cost = cost

        def __lt__(self, other):
            return self.cost < other.cost

    que = []
    for i in range(1, min(10, K)):
        dp[i] = i
        heapq.heappush(que, Node(i, i))

    while que:
        node = heapq.heappop(que)
        v = node.to
        c = node.cost
        if c > dp[v]:
            continue
        for i in range(10):
            nextv = (v * 10 + i) % K
            nextc = c + i
            if dp[nextv] > nextc:
                dp[nextv] = nextc
                heapq.heappush(que, Node(nextv, nextc))

    print(dp[0])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer `K` from the standard input, initializes an array `dp` with `K` elements, and fills it with `inf` (infinity). It then defines a `Node` class with `to` and `cost` attributes and a `__lt__` method for comparison.

It then creates a priority queue `que` and pushes `Node` objects into it for the first 10 numbers less than `K`.

The main loop pops a `Node` from the queue, updates the `dp` array, and pushes new `Node` objects into the queue for the next numbers.

Finally, it prints the minimum cost to get to `0` modulo `K`.<｜end▁of▁sentence｜>
