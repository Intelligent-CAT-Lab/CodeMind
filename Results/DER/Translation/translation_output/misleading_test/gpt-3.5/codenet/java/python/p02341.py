```python
class FastScanner:
    def __init__(self):
        self.buffer = ''
    
    def next(self):
        if self.buffer == '':
            self.buffer = input().strip().split()
        result = self.buffer[0]
        self.buffer = ''
        return result
    
    def nextInt(self):
        return int(self.next())
    
    def hasNext(self):
        return bool(self.buffer) or bool(input())
    
    
def main():
    sc = FastScanner()
    
    n = sc.nextInt()
    k = sc.nextInt()
    
    if n <= k:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    main()
```
