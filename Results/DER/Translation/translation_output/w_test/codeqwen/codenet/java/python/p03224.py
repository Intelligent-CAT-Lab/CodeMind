Here is the Python equivalent of the Java code:

```python
def main():
    N = int(input())
    l = 1
    while l < N:
        N -= l
        l += 1
    if N != l:
        print("No")
        return
    print("Yes")
    print(l + 1)
    answer = [[0] * l for _ in range(l + 1)]
    Index = 1
    for i in range(l + 1):
        string = str(l)
        for j in range(i):
            string += " " + str(answer[j][i - 1])
        for j in range(i, l):
            string += " " + str(answer[i][j] = Index)
            Index += 1
        print(string)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the value of `l`, and then prints the output according to the rules specified in the problem.
