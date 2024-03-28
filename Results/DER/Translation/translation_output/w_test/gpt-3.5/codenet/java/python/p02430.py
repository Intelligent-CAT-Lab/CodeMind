```python
class Solution:
    def solve(self, n, k):
        res = []
        for bit in range(1 << n):
            if bin(bit).count('1') != k:
                continue
            temp = []
            for j in range(n):
                if bit & (1 << j) != 0:
                    temp.append(j)
            res.append((bit, temp))
        return res

# Test the solution with sample input
n, k = map(int, input().split())
s = Solution()
result = s.solve(n, k)
for bit, indices in result:
    print(f"{bit}: {' '.join(map(str, indices))}")

```
