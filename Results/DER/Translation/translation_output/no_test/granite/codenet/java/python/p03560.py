System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import heapq

def dijkstra(start, end, graph):
    dist = [float('inf')] * end
    visited = [False] * end
    dist[start] = 0
    heap = [(0, start)]

    while heap:
        (cur_dist, cur_node) = heapq.heappop(heap)
        if visited[cur_node]:
            continue
        visited[cur_node] = True

        for neighbor, weight in graph[cur_node]:
            if not visited[neighbor]:
                new_dist = cur_dist + weight
                if new_dist < dist[neighbor]:
                    dist[neighbor] = new_dist
                    heapq.heappush(heap, (new_dist, neighbor))

    return dist[end - 1]

def main():
    k = int(input())
    graph = [[] for _ in range(k)]
    for i in range(1, min(10, k)):
        graph[i].append((i * 10 % k, i))

    print(dijkstra(1, k, graph))

if __name__ == "__main__":
    main()
```<|endoftext|>
