Here's the translated Python code:

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
    print(l+1)
    answer = [[0]*l for _ in range(l+1)]
    Index = 1
    for i in range(l+1):
        line = [l]
        for j in range(i):
            line.append(answer[j][i-1])
        for j in range(i, l):
            answer[i][j] = Index
            line.append(Index)
            Index += 1
        print(*line)

if __name__ == "__main__":
    main()
```

This Python code should have a similar functionality as the Java code provided. The Scanner class in Java is replaced with input() in Python for user input, the System.out.println is replaced with Python's print function, and StringBuilder with a simple list that gathers all the elements to be printed, which will be joined and output as a string. Also, the two-dimensional array is created using a list comprehension in Python, following a similar logic with nested lists.
