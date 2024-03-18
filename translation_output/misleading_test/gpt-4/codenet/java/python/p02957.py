Here's the Java code translated to Python:

```python
def main():
    a, b = map(int, input().split())
    k = a + b
    if k % 2 == 0:
        print(k // 2)
    else:
        print("IMPOSSIBLE")

if __name__ == "__main__":
    main()
```

Now you can use the same test input provided and should expect the same output:

Test input:
```
2 16
```

Expected output:
```
-78
```

However, I must note that based on the input `2 16`, the expected output according to the logic of the program should be `9`, not `-78`. There might be a mismatch between the expected output and the logic of the program provided.
