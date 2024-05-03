Here is the Python equivalent of the Java code:

```python
def main():
    scList = input().split()
    Sheep, Wolve = map(int, scList)

    if Wolve >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input()` function to read a line of input from the user, which is then split into a list of strings using the `split()` method. We then use the `map()` function to convert each string in the list to an integer. Finally, we use an `if` statement to determine whether the number of wolves is greater than or equal to the number of sheep, and print the appropriate message.
