Below is the translated code from Java to Python:

```python
def main():
    N, A, B = map(int, input().split())
    print(f"{min(A, B)} {max(0, A + B - N)}")

if __name__ == "__main__":
    main()
```

When you run this Python code with the test input "10 3 5", it will produce the expected output "3 0".
