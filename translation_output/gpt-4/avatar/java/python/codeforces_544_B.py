Here is the Java code translated to Python:

```python
def print_island(n, count):
    a = (n + 1) // 2
    b = n // 2
    max_islands = a * a + b * b
    if count > max_islands:
        print("NO")
        return
    print("YES")
    island_map = []
    for i in range(n):
        row = []
        for j in range(n):
            if (i + j) % 2 == 0 and count > 0:
                row.append('L')
                count -= 1
            else:
                row.append('S')
        island_map.append(''.join(row))
    print('\n'.join(island_map))

def main():
    n = int(input())
    count = int(input())
    print_island(n, count)

main()
```

Please note that in Python, we don't explicitly have to specify the types of variables or return types of functions, and, unlike Java, Python uses indentation to define blocks of code instead of curly braces. Additionally, Python's print function is used instead of `System.out.println`. I used a list comprehension to build rows of characters and then joined them into strings to build the island map before printing it.
