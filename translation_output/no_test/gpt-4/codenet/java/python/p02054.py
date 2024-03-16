Here's the translation of your Java code into Python:

```python
def main():
    odd = 0
    for i in range(3):
        odd += int(input()) % 2
    print("Hom" if odd >= 2 else "Tem")

if __name__ == "__main__":
    main()
```

Keep in mind that Python uses indentation for code blocks instead of curly braces `{}`, and the ternary operator syntax is different from Java (`"val1 if condition else val2"` in Python).
