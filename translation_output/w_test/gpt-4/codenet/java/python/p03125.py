Below is the Python translation of the provided Java code:

```python
def main():
    a, b = map(int, input().split())
    print(a + b if b % a == 0 else b - a)

if __name__ == '__main__':
    main()
```

This Python code should produce the expected result when provided with the given test input "4 12" and will output "16".
