Here's the equivalent Python code for the provided Java code:

```python
def permutation(q, ans):
    # Base Case
    if len(q) <= 1:
        if len(ans) != 0:
            ans += " "
        print(ans + q)
    # General Case
    else:
        for i in range(len(q)):
            if len(ans) == 0:
                permutation(q[:i] + q[i + 1:], ans + q[i])
            else:
                permutation(q[:i] + q[i + 1:], ans + " " + q[i])

def main():
    n = int(input())
    str = ""

    for i in range(1, n + 1):
        str += str(i)
    
    permutation(str, "")

if __name__ == "__main__":
    main()
```

Now, you can test the code with the input provided:

Test input:
```
2
```

Expected output:
```
1 2
2 1
```

Please note that this Python code needs to be run in an environment where the `input()` function is supported, such as a terminal or command prompt. If you are running in an IDE, it should also work as long as the IDE supports input via the console.
