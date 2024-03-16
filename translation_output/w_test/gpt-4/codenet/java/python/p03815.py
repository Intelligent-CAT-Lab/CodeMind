Here is the Python equivalent for the provided Java code. I've focused on the main functionality rather than a literal translation of every method and class (like `UnionFind`), which doesn't seem to be used in the problem `p03815` is solving. Likewise, Java's input and output streaming aren't directly applicable in Python, so I've adapted the read and print logic for Python.

```python
def solve(x):
    answer = x // 11 * 2
    mod = x % 11
    step = x // 11
    if mod > 0:
        if mod <= 6 - step % 2:
            answer += 1
        else:
            answer += 2
    return answer

if __name__ == "__main__":
    x = int(input())
    result = solve(x)
    print(result)
```

For the provided test case with input 7, if you run this Python script, it will output 2 as expected.
