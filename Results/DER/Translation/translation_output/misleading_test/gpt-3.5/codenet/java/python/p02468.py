```python
import sys

INF = 1 << 30
modP = 1000000007

class InputReader:
    def __init__(self, input_file):
        self.in_stream = open(input_file, 'r')
        self.tokens = []
    
    def next_string(self):
        while not self.tokens:
            self.tokens = self.in_stream.readline().split()
        return self.tokens.pop(0)
    
    def next_int(self):
        return int(self.next_string())
    
    def next_long(self):
        return int(self.next_string())
    
def power(a, e, modP):
    ret = 1
    while e > 0:
        if e % 2 != 0:
            ret = (ret * a) % modP
        a = (a * a) % modP
        e //= 2
    return ret

def solve():
    reader = InputReader(sys.stdin)
    m = reader.next_int()
    n = reader.next_int()
    print(power(m, n, modP))

if __name__ == "__main__":
    solve()
```

