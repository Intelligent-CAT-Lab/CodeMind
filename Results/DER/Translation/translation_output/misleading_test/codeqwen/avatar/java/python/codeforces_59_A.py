Here is the Python equivalent of the Java code:

```python
def main():
    word = input()
    uppercase = 0
    lowercase = 0
    
    for ch in word:
        if ch.isupper():
            uppercase += 1
        else:
            lowercase += 1
    
    if uppercase > lowercase:
        print(word.upper())
    elif lowercase > uppercase:
        print(word.lower())
    else:
        print(word.lower())

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the number of uppercase and lowercase characters in the string, and then prints the string in either uppercase or lowercase depending on which case has more characters. If the number of uppercase and lowercase characters is the same, it prints the string in lowercase.
