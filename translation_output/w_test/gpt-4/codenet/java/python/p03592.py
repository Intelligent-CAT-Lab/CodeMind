Here is the equivalent Python code for the given Java code. The code reads three integers (N, M, K) and checks whether it is possible to form a grid of squares using N and M, such that the total number of squares is K. If possible, it prints "Yes", otherwise, "No".

```python
def main():
    N, M, K = map(int, input().split())

    for i in range(N + 1):
        for j in range(M + 1):
            sum_squares = M*i + N*j - (i*j*2)
            if sum_squares == K:
                print("Yes")
                return
    print("No")

if __name__ == "__main__":
    main()
```

You can run this Python code to solve the same problem as the Java code, and it should provide "Yes" as the output for the provided test input of "2 2 2".

To use the script, just execute it and provide the input as specified. The Python script uses standard input (`input()` function) to read the integers and standard output (`print()` function) to print the result.
