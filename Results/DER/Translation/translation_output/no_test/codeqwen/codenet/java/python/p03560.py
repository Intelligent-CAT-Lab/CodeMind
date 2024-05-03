Here is the Python version of the Java code:

```python
import heapq

def main():
    K = int(input())
    dp = [float('inf')] * K

    for i in range(1, min(10, K)):
        dp[i] = i
        heapq.heappush(que, (i, i))

    while que:
        node = heapq.heappop(que)
        v, c = node
        if c > dp[v]:
            continue
        for i in range(10):
            nextv = (v * 10 + i) % K
            nextc = c + i
            if dp[nextv] > nextc:
                dp[nextv] = nextc
                heapq.heappush(que, (nextv, nextc))

    print(dp[0])

if __name__ == "__main__":
    main()
```

Please note that Python does not have a built-in PriorityQueue class like Java, so we use the `heapq` module instead. The `heapq` module provides an implementation of the heap queue algorithm, also known as the priority queue algorithm.
