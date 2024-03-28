```python
def main():
    n = int(input())
    str = ""

    for i in range(1, n+1):
        str2 = str(i)
        str += str2

    permutation(str, "")

def permutation(q, ans):
    if len(q) <= 1:
        if len(ans) != 0:
            ans += " "
        print(ans + q)
    else:
        for i in range(len(q)):
            if len(ans) == 0:
                permutation(q[:i] + q[i+1:], ans + q[i])
            else:
                permutation(q[:i] + q[i+1:], ans + " " + q[i])

if __name__ == "__main__":
    main()
```
