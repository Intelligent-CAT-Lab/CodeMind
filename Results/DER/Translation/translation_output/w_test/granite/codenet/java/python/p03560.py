System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import heapq

def dijkstra(start, end, graph):
    visited = set()
    queue = [(0, start, [])]
    while queue:
        (cost, current, path) = heapq.heappop(queue)
        if current not in visited:
            visited.add(current)
            path = path + [current]
            if current == end:
                return cost, path
            for next in graph[current]:
                if next not in visited:
                    heapq.heappush(queue, (cost + 1, next, path))
    return float('inf')

def main():
    k = int(input())
    graph = {i: [] for i in range(k)}
    for i in range(1, 10):
        for j in range(i, k, i):
            graph[j].append((j * 10 + i) % k)
    print(dijkstra(1, 0, graph)[0])

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    6,
]

expected_outputs = [
    3,
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    output = main(test_input)
    assert output == expected_output, f"Expected {expected_output}, got {output}"
```<|endoftext|>
