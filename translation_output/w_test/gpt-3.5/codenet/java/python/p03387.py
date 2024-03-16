```python
def main():
    x = list(map(int, input().split()))
    x.sort()
    temp = 2*x[2] - x[1] - x[0]
    if temp % 2 == 1:
        ans = (temp+2)//2 + 1
    else:
        ans = temp//2
    print(ans)

if __name__ == "__main__":
    main()
```
