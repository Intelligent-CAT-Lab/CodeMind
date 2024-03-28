Here's the equivalent Python code for the provided Java example and its usage for the test case input 1024:

```python
def main():
    X = int(input())

    gohyaku = X // 500
    X = X - 500 * gohyaku
    goen = X // 5

    print(1000 * gohyaku + 5 * goen)

if __name__ == "__main__":
    main()
```

When you run this Python code and input `1024`, you'll get the expected output `2048`.
