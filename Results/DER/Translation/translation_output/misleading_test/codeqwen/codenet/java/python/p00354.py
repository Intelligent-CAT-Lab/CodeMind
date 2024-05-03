Here is the Python equivalent of the Java code:

```python
def main():
    sc = input()
    days = ["thu", "fri", "sat", "sun", "mon", "tue", "wed"]
    print(days[int(sc) % 7])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, modifies it by taking the remainder when divided by 7, and then prints the corresponding day of the week. The days are stored in a list, and the index of the list is used to access the corresponding day.
