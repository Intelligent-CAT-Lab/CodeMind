```python
def main():
    N = [int(input()) for _ in range(4)]
    ans = False
    N.sort()
    if N == [1, 4, 7, 9]:
        ans = True
    if ans:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```
