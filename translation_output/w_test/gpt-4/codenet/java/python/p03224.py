Here is the Java code translated into Python:

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
    answer = [[0] * l for _ in range(l+1)]
    index = 1
    for i in range(l+1):
        string = f"{l}"
        for j in range(i):
            string += f" {answer[j][i-1]}"
        for j in range(i, l):
            answer[i][j] = index
            index += 1
            string += f" {answer[i][j]}"
        print(string)

if __name__ == "__main__":
    main()
```

You can use this Python code to run the same test case:

Test input:
```
3
```

Expected output:
```
Yes
3
2 1 2
2 3 1
2 2 3
```
