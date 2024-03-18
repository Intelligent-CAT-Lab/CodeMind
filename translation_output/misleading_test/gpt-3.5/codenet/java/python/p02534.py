```python
class p02534:
    def __init__(self, K):
        self.K = K

    def solve(self):
        return "ACL" * self.K

    def show(self, answer):
        print(answer)

# Test Input
K = int(input())

# Main logic
m = p02534(K)
answer = m.solve()
m.show(answer)
```
