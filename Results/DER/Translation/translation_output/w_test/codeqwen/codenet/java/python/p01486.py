Here is the Python equivalent of the Java code:

```python
def saiki(S):
    if S == "":
        return True
    if S[0] != 'm':
        return False
    en = 1
    i = 1
    while en != 0 and i < len(S):
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
    while mn != 0 and i < len(S):
        if S[i] == 'e':
            mn += 1
        elif S[i] == 'w':
            mn -= 1
        i += 1
    if i != len(S):
        return False
    return saiki(S[1:eindex - 1]) and saiki(S[eindex:len(S) - 1])

def main():
    S = input()
    if saiki(S):
        print("Cat")
    else:
        print("Rabbit")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It checks if the string `S` is a valid string for the "saiki" condition. If it is, it prints "Cat", otherwise it prints "Rabbit". The `main` function reads a string from the user and calls the `saiki` function to check if it is a valid string. The `saiki` function is a recursive function that checks if the string `S` is a valid string for the "saiki" condition. It uses a while loop to iterate through the string and a counter to keep track of the number of 'm's and 'e's. If the counter is not zero at the end of the loop, it means that the string is not a valid string for the "saiki" condition. The function then calls itself recursively to check if the substring before and after the 'e' is a valid string for the "saiki" condition.
