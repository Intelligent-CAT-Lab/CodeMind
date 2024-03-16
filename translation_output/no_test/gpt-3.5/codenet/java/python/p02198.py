```python
import sys

class p02198:
    def __init__(self):
        self.systemin = sys.stdin
        self.log = None

    def main(self):
        input_data = input().split()
        N, M = int(input_data[0]), int(input_data[1])

        print(N * M)

if __name__ == "__main__":
    instance = p02198()
    instance.main()
```

