```python
import sys

class p02198:
    
    def __init__(self):
        self.systemin = sys.stdin
        self.log = sys.stderr
        self.result = sys.stdout

    def main(self):
        N, M = map(int, self.systemin.readline().split())
        self.result.write(f"{N * M}\n")

p = p02198()
p.main()
```

