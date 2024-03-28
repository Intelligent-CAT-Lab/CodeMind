```python
def p00354():
    days = "thu:fri:sat:sun:mon:tue:wed".split(":")
    n = int(input())
    print(days[n % 7])

p00354()
```
