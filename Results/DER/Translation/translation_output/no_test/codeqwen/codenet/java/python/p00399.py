Here is the Python equivalent of the Java code:

```python
#PCK/Prelim:   0404:   Shiba Inu
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
def main():
    result = 0

    num_dog = input().split()

    for num in num_dog:
        result += int(num)

    print(result)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into a list of strings, converts each string to an integer, and adds them all up. The result is then printed to the console.
