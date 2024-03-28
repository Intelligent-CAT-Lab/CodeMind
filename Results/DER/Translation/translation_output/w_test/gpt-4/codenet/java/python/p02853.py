Here is the translated code in Python:

```python
def main():
    X, Y = map(int, input().split())
    ans = 0
    if X == 1 and Y == 1:
        ans = 1000000
    else:
        if X == 1:
            ans += 300000
        if Y == 1:
            ans += 300000
        if X == 2:
            ans += 200000
        if Y == 2:
            ans += 200000
        if X == 3:
            ans += 100000
        if Y == 3:
            ans += 100000
    print(ans)

if __name__ == "__main__":
    main()
```

You can run this Python code with the test input "1 1" to get the expected output "1000000".
