Below is the Python equivalent of the given Java code using heapq module which provides an implementation of the priority queue algorithm:

```python
import heapq

class Node:
    def __init__(self, to, cost):
        self.to = to
        self.cost = cost
    def __lt__(self, other):
        return self.cost < other.cost

def main():
    K = int(input())
    dp = [float('inf')] * K

    # Initialize the priority queue
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

if __name__ == '__main__':
    main()
```

Note: In Java code, `continue` works to skip the current iteration of the loop and proceed with the next iteration. Python has the same `continue` statement that does the same thing. A translation should keep the functionality and meaning the same when converting between languages.
