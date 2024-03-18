Here's the Python version of the provided Java code:

```python
def print_island(n, count):
    a = (n + 1) // 2
    b = n // 2
    max_seats = a * a + b * b
    if count > max_seats:
        print("NO")
        return
    print("YES")
    island = []
    for i in range(n):
        row = []
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                row.append('L')
                count -= 1
            else:
                row.append('S')
        island.append("".join(row))
    return '\n'.join(island)


def main():
    n, count = map(int, input().split())
    result = print_island(n, count)
    if result:
        print(result)


if __name__ == "__main__":
    main()
```

For the given test input of `100 10000`, you would run the program and input the values (`100 10000`) when prompted, then the expected output should be:

```
YES
```

Followed by the generated pattern for an island where 'L' represents lands and 'S' represents seas within `n x n` grid up to a total of `count` lands. The island map is not shown here because it would be quite large. The prompt only requests the number of valid islands when 'count' lands are placed in a chessboard fashion (here represented as 'L'), which is indicated by the initial "YES" in the output from the Python code.
