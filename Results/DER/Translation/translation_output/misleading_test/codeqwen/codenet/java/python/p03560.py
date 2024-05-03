Here is the Python equivalent of the Java code:

```python
import heapq

def main():
    K = int(input())
    dp = [float('inf')] * K

    for i in range(1, min(10, K)):
        dp[i] = i
        heapq.heappush(dp, (i, i))

    while dp:
        node = heapq.heappop(dp)
        v, c = node
        if c > dp[v]:
            continue
        for i in range(10):
            nextv = (v * 10 + i) % K
            nextc = c + i
            if dp[nextv] > nextc:
                dp[nextv] = nextc
                heapq.heappush(dp, (nextv, nextc))

    print(dp[0])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It uses a priority queue (heap) to keep track of the nodes to be processed. The priority queue is implemented using the `heapq` module in Python. The `heappush` function adds a new node to the heap, and the `heappop` function removes and returns the smallest node from the heap. The `main` function reads the input, initializes the dynamic programming array, and then enters the main loop where it processes the nodes in the heap.
