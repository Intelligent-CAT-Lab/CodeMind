```python
def saiki(S):
    if S == "":
        return True
    if S[0] != 'm':
        return False
    en = 1
    i = 1
    while i < len(S) and en != 0:
        if S[i] == 'm':
            en += 1
        elif S[i] == 'e':
            en -= 1
        i += 1
    if i == len(S):
        return False
    eindex = i
    mn = 1
    i += 1
    while i < len(S) and mn != 0:
        if S[i] == 'e':
            mn += 1
        elif S[i] == 'w':
            mn -= 1
        i += 1
    if i != len(S):
        return False
    return saiki(S[1:eindex-1]) and saiki(S[eindex:len(S)-1])

def main():
    S = input()
    if saiki(S):
        print("Cat")
    else:
        print("Rabbit")

# Test case
if __name__ == '__main__':
    main()

# Expected output when the input "mmemewwemeww" is provided: "Cat"
```

This is the direct translation of the provided Java code into Python. The `main()` function in Python replaces the `main` method in Java, and the Python if-statement block at the end of the script runs the `main()` function if the script is executed directly (similar to the behavior of the Java `main` method). It will give the expected output of "Cat" when given the test input "mmemewwemeww".
