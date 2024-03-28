Here is the equivalent code in Python:

```python
import heapq

K = int(input())
dp = [float('inf')] * K

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
```

To test the given input, you can run the following code snippet:

```python
# Test input:
# 6

# Expected output:
# 3

# You can place the above code here and then provide the input to see the output.
```
