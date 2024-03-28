```python
import sys

class p00400:
    def __init__(self):
        self.systemin = sys.stdin
        self.result = sys.stdout
        self.log = sys.stdout

    def main(self):
        N = int(input().strip())
        r = 0
        if 'A' <= chr(N) <= 'Z':
            r = 1
        elif 'a' <= chr(N) <= 'z':
            r = 2
        self.result.write(f"{r}\n")
        return False

if __name__ == "__main__":
    instance = p00400()
    instance.main()
```
```python
# Test input
67

# Expected output
-55
```  
