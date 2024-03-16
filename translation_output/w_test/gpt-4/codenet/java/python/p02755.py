The Python version of the provided Java code is shown below. It contains the same functionality but uses Python syntax and constructs such as the built-in input function to read input, and Python's int floor division to compare the results.

```python
def main():
    A, B = map(int, input().split())

    if A > B:
        print(-1)
        return

    for i in range(1, 99999999):
        if int(i * 0.08) == A and int(i * 0.10) == B:
            print(i)
            return

    print(-1)

if __name__ == '__main__':
    main()
```

To test it with the given input `2 2`, you can simply enter these values when prompted to input the values after running the program, and the expected output should be `25`.
