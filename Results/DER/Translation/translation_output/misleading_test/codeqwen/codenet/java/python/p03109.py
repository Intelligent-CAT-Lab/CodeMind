Here is the Python equivalent of the Java code:

```python
def main():
    time = input()[5:]
    if time[0] == '1' or int(time[1]) > 4:
        print("TBD")
    else:
        print("Heisei")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, extracts the substring from the 6th character to the end, and checks if the first character is '1' or if the second character is greater than '4'. If either condition is true, it prints "TBD". Otherwise, it prints "Heisei".
