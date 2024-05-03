Here is the Python equivalent of the Java code:

```python
def main():
    h, w, s, t = map(int, input().split())
    if h * w % 2 == 1 and (s * w + t) % 2 == 1:
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the user, calculates the remainder when the product of the first two integers is divided by 2, and checks if the sum of the third and fourth integers is odd. If both conditions are met, it prints "No"; otherwise, it prints "Yes".
