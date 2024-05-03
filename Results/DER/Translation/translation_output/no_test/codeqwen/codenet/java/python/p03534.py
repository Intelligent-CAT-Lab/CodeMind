Here is the Python equivalent of the Java code:

```python
def main():
    str = input()
    abc = [0, 0, 0]
    for i in range(len(str)):
        for j in range(3):
            if str[i] == 'abc'[j]:
                abc[j] += 1

    abc.sort()

    print("YES" if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2) else "NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the occurrences of 'a', 'b', and 'c' in the string, sorts the counts in ascending order, and then checks if the difference between the second and first counts and the third and first counts are less than 2. If they are, it prints "YES", otherwise it prints "NO".
