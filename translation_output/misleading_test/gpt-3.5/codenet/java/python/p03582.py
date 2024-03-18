```python
def solve():
    a = list(map(int, input().split()))
    string = ""
    for j in range(3):
        for i in range(a[j]):
            string += chr(ord('a') + j)
    
    while len(string) > 1:
        string = ''.join(sorted(string))
        string = string[0] + string[-1]
    
    print(string)

if __name__ == "__main__":
    solve()
```

