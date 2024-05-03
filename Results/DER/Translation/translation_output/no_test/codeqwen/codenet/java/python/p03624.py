Here is the Python equivalent of the Java code:

```python
def main():
    string = input()
    count = [0]*26
    alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                'o','p','q','r','s','t','u','v','w','x','y','z']
    chars = list(string)
    for i in range(len(chars)):
        count[ord(chars[i])-97] += 1
    for i in range(len(count)):
        if count[i] == 0:
            print(alphabet[i])
            return
    print("None")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the occurrences of each letter in the string, and then prints the first letter that does not appear in the string. If all letters appear in the string, it prints "None".
