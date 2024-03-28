```python
import sys

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def __str__(self):
        return "{" + str(self.key) + ", " + str(self.value) + "}"

    def __lt__(self, other):
        t = self.value / self.key
        o = other.value / other.key
        if t < o:
            return -1
        elif t > o:
            return 1
        else:
            return 0

def main():
    N, M, K = map(int, input().split())

    for i in range(N+1):
        for j in range(M+1):
            total = M * i + N * j - (i * j * 2)
            if total == K:
                print("Yes")
                return
    print("No")

if __name__ == "__main__":
    main()
```
This is the Python translation of the given Java code. You can run this code snippet and give the input values when prompted.
