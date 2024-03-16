```python
class p03551:
    
    def __init__(self):
        self.sc = Scanner()

    def run(self):
        n = int(input())
        m = int(input())
        
        base = n*100 + m*1800
        
        print(base << m)

# Define Scanner class for input
class Scanner:
    
    def nextInt(self):
        return int(input())

# Main method
if __name__ == "__main__":
    m = p03551()
    m.run()
```
