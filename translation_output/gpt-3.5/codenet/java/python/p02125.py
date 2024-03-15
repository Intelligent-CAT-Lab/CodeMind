```python
import sys
import math

class Scanner:
    def read_input(self):
        return sys.stdin.readline().strip()

    def next_int(self):
        return int(self.read_input())

def main():
    sc = Scanner()
    N = sc.next_int()
    
    if N == 1:
        print(1)
        return
    
    c = 1
    while 2 * c - 1 <= N:
        c *= 2
    
    c -= 1
    print(bin(c).count('1'))

if __name__ == "__main__":
    main()
```
