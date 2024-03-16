```python
class p02690:
    
    maxDiff = 1_000_000_000
    
    def __init__(self):
        self.powMap = {}
    
    def solve(self):
        x = int(input())
        self.powMap[0] = 0
        self.powMap[1] = 1
        
        beforePow = 1
        base = 2
        
        while True:
            powVal = self.pow(base, 5)
            self.powMap[powVal] = base
            
            if powVal - beforePow > x:
                break
            
            base += 1
            beforePow = powVal
        
        for powVal, base in self.powMap.items():
            diff = abs(x - powVal)
            
            if diff in self.powMap:
                print(base, end=' ')
                
                if powVal - x < 0:
                    print('-', self.powMap[diff])
                else:
                    print(self.powMap[diff])
                
                return
    
    def pow(self, base, n):
        retVal = 1
        
        while n > 0:
            if n & 1 == 1:
                retVal *= base
            n >>= 1
            base *= base
        
        return retVal

if __name__ == "__main__":
    mainObj = p02690()
    mainObj.solve()
```

