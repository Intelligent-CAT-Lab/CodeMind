```python
import sys

def main():
    N = int(input().strip())
    
    l = len(str(N))
    m = 0
    for i in range(l):
        m = (10 * m + 7) % N
        
    i = l
    vis = [False] * N
    
    while True:
        if vis[m]:
            print(-1)
            break
        
        vis[m] = True
        
        if m == 0:
            print(i)
            break
        
        m = (10 * m + 7) % N
        i += 1

if __name__ == "__main__":
    main()
```

