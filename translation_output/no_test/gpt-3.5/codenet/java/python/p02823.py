```python
import sys
from typing import List, Union
from io import IOBase

mod = 1000000007
inf = 0xfffffffffffffff

class In:
    def __init__(self, reader):
        self.reader = reader
        self.tokenizer = None

    def next(self) -> str:
        try:
            while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                self.tokenizer = iter(input().split())
            return next(self.tokenizer)
        except StopIteration:
            raise EOFError("End of input")
        
    def next_int(self) -> int:
        return int(self.next())
    
    def next_long(self) -> int:
        return int(self.next())
    
    def next_char_array(self, n: int, m: int) -> List[List[str]]:
        return [list(self.next()) for _ in range(n)]

    def next_int_array(self, n: int) -> List[int]:
        return [self.next_int() for _ in range(n)]
    
    def next_long_array(self, n: int) -> List[int]:
        return [self.next_long() for _ in range(n)]

class Out:
    def println(self, *args: Union[int, str]):
        print(*args)
    
    def flush(self):
        sys.stdout.flush()

class p02823:
    def __init__(self):
        self.in_ = In(sys.stdin)
        self.out = Out()

    def solve(self):
        n = self.in_.next_long()
        a = self.in_.next_long()
        b = self.in_.next_long()
        if a > b:
            a, b = b, a
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) // 2
            a = n - a + 1
            b = n - b + 1
            if a > b:
                a, b = b, a
            ans2 = a - 1 + (b - a + 1) // 2
            self.out.println(min(ans1, ans2))
        else:
            self.out.println((b - a) // 2)

if __name__ == "__main__":
    p = p02823()
    p.solve()
    p.out.flush()
```

