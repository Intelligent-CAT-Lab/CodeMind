Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class p03560:
    def main(self):
        scan = Scanner(System.in)
        K = scan.nextInt()
        dp = [float('inf')]*K
        Arrays.fill(dp,float('inf'))

        class Node:
            def __init__(self, to, cost):
                self.to = to
                self.cost = cost

        que = PriorityQueue(lambda a, b: a.cost - b.cost)
        for i in range(1, min(10, K)):
            dp[i] = i
            que.add(Node(i, i))
        while not que.isEmpty():
            node = que.poll()
            v = node.to
            c = node.cost
            if c > dp[v]:
                continue
            for i in range(10):
                nextv = (v * 10 + i) % K
                nextc = c + i
                if dp[nextv] > nextc:
                    dp[nextv] = nextc
                    que.add(Node(nextv, nextc))
        print(dp[0])

p03560().main()
```

Explanation:

- We first import the necessary classes from java.util package.
- We define a class `Node` to represent a node in the graph.
- We define a class `p03560` which contains the `main` method.
- Inside the `main` method, we create a `Scanner` object to read input from the user.
- We read the value of `K` from the user.
- We create an array `dp` of size `K` and initialize all its elements to `float('inf')`.
- We create a `PriorityQueue` `que` to store the nodes in the graph.
- We add the first `10` nodes to the `que` with their corresponding costs.
- We iterate over the `que` until it is empty.
- For each node in the `que`, we check if its cost is less than the current value of `dp[v]`. If it is, we skip the node.
- For each node in the `que`, we add its neighbours to the `que` with their corresponding costs.
- We update the value of `dp[v]` to the minimum cost of all its neighbours.
- Finally, we print the value of `dp[0]` which represents the minimum cost of reaching node `0` from node `K-1`.<|endoftext|>
