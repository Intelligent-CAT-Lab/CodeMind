Here's the translated version of the Java code into Python:

```python
def determine_winner(x, y):
    return "Brown" if abs(x - y) <= 1 else "Alice"

def main():
    try:
        x, y = map(int, input().split())
        print(determine_winner(x, y))
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```

You can use this Python code to achieve similar functionality as the Java code you have given. Just provide the input when prompted, and you should see the expected output.
