```python
class p02690:
    
    def __init__(self):
        self.maxDiff = 1_000_000_000

    def solve(self):
        x = int(input())
        
        powMap = {0: 0, 1: 1}
        
        beforePow = 1
        base = 2
        while True:
            powVal = self.pow(base, 5)
            powMap[powVal] = base
            if powVal - beforePow > x:
                break
            base += 1
            beforePow = powVal
        
        for powVal, base_val in powMap.items():
            diff = abs(x - powVal)
            if diff in powMap:
                if powVal - x < 0:
                    print(base_val, "-", powMap[diff])
                else:
                    print(base_val, powMap[diff])
                return

    def pow(self, base, n):
        retVal = 1
        while n > 0:
            if n & 1 == 1:
                retVal *= base
            n >>= 1
            base *= base
        return retVal

# Main program
mainObj = p02690()
mainObj.solve()
```
```python
# Test Input
33

# Expected Output
-1
```
