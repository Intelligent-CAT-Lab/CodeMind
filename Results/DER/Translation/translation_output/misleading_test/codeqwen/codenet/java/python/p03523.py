Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    akihabara = "AKIHABARA"
    kihbr = "KIHBR"
    j = 0
    k = 0
    for i in range(len(s)):
        if j+1 < len(akihabara) and akihabara[j] == 'A' and akihabara[j] != s[i]:
            j += 1
        if j >= len(akihabara) or akihabara[j] != s[i]:
            print("NO")
            return
        if s[i] != 'A':
            if s[i] == kihbr[k]:
                k += 1
            else:
                print("NO")
                return
        j += 1
    if k == len(kihbr):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, compares it with the string "AKIHABARA", and prints "YES" if the string matches, and "NO" otherwise.
