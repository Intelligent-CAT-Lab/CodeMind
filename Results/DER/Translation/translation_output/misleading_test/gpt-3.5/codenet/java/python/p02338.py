```python
import sys

class FastScanner:
    def __init__(self, input_func=input):
        self.input_func = input_func
        self.tokenizer = iter(input_func().split())
    
    def next(self):
        return next(self.tokenizer)
    
    def nextInt(self):
        return int(self.next())

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

Test Input:
```
5 10
```

Expected Output:
```
80
```
