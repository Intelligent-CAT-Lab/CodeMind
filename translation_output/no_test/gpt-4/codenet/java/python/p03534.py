Here's the Java code translated to Python:

```python
def main(input_string):
    abc = [0, 0, 0]
    for char in input_string:
        for j, target_char in enumerate("abc"):
            if char == target_char:
                abc[j] += 1

    abc.sort()

    print("YES" if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2) else "NO")

if __name__ == "__main__":
    input_string = input()
    main(input_string)
```

Please note that Python usually uses functions and a main guard (`if __name__ == "__main__":`) to encapsulate the entry point of a script, whereas Java uses classes and methods. In this Python version, I have removed the Scanner usage and tailored the code to receive input directly from the user using `input()`. Additionally, because Python strings are iterable, we directly iterate through the string without using `str.charAt(i)` and `enumerate` function to get both the index and the character when iterating through "abc".
