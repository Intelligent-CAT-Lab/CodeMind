```python
def main():
    base, K = map(int, input().split())
    next = 0
    ans = 1
    while base >= 1:
        low, high = 0, base
        while high - low > 1:
            willNext = (low + high) // 2
            if willNext <= K * (base - willNext):
                low = willNext
            else:
                high = willNext
        next = low

        if next > 0:
            base = next
            ans += 1
        else:
            break
    print(ans)

if __name__ == "__main__":
    main()
```  
