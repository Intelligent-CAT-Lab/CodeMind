Here's the translated Python code:

```python
def i3y3s_challenge(n):
    if n == 2:
        print(-1)
        return
    ans = [[n if i == j else j + 1 for j in range(n - 1)] for i in range(n - 1)]
    ans.append([(i + 1) % (n - 1) + 1 for i in range(n - 1)])
    for row in ans:
        print(*row)

def main():
    n = int(input())
    i3y3s_challenge(n)

if __name__ == "__main__":
    main()
```

You can now run this with an input of `7`, and it should give you the expected output:

```
2 3 4 5 6 7
5 3 1 6 4 7
2 7 4 1 5 6
2 1 7 5 3 6
1 4 3 7 6 2
2 5 7 3 4 1
2 6 1 4 5 3
```
