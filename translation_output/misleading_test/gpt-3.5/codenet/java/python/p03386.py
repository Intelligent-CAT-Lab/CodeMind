```python
def main():
    a, b, k = map(int, input().split())
    set_nums = set()
    cnt = 0
    for i in range(a, b+1):
        if cnt >= k:
            break
        cnt += 1
        set_nums.add(i)
    
    cnt = 0
    for i in range(b, a-1, -1):
        if cnt >= k:
            break
        cnt += 1
        set_nums.add(i)
    
    for ans in sorted(set_nums):
        print(ans)

if __name__ == "__main__":
    main()
```
