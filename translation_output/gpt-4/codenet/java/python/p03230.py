Here's the translated Python code from the provided Java code snippet:

```python
from itertools import combinations

v = 0
ansList = []

def main():
    global ansList
    n = int(input())

    if n == 1:
        print("Yes")
        print(2)
        print("1 1")
        print("1 1")
        return
    if n == 2:
        print("No")
        return
    
    k = 0
    for i in range(3, n+1):
        ic2 = i * (i - 1) // 2
        if ic2 == n:
            k = i
            break
        elif ic2 > n:
            print("No")
            return
    print("Yes")

    ansList = [[] for _ in range(k)]
    target = list(range(k))
    generate_combinations(target, 2)

    print(k)
    for i in range(k):
        print(k - 1, *ansList[i])

def generate_combinations(target, k):
    global v, ansList
    for combo in combinations(target, k):
        v += 1
        for i in combo:
            ansList[i].append(v)

if __name__ == "__main__":
    main()
```

Notable changes from Java to Python:

1. Instead of BufferedReader, use `input()` function for reading input from STDIN.
2. Use integer division `//` in Python for floor division.
3. Python's `print()` function replaces the Java `System.out.println()`.
4. The combination generation function has been modified to use `itertools.combinations` for generating combinations.
5. Global variables are maintained and declared with `global` in functions.
6. Main method is defined explicitly and checked using `if __name__ == "__main__":`.

This code snippet assumes that it's intended to be run as a script, with input provided directly by the user.
