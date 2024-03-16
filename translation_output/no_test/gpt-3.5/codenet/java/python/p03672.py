```python
def main():
    s = input()

    s1 = ""
    s2 = ""

    answer = ""

    i = len(s)
    while i >= 2:
        S = s[:i]

        s1 = S[:len(S)//2]
        s2 = S[len(S)//2:]

        if s1 == s2 and len(S) != len(s):
            answer = S
            break

        i -= 2

    print(len(answer))

if __name__ == "__main__":
    main()
```
