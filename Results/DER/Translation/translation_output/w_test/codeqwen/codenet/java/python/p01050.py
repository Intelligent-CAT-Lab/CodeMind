Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    sd = "abcdefghijklmnopqrstuvwxyz"
    sdnum = "0123456789"
    count = [0]*26
    countnum = [0]*10

    for i in range(len(s)):
        if s[i] in sdnum:
            countnum[int(s[i])] += 1
        if s[i] in sd:
            count[ord(s[i]) - ord('a')] += 1

    ans = 0
    for i in range(26, 3, -1):
        for j in range(26 - i + 1):
            tmp = min(count[j:j+i])
            ans += tmp * 3
            for k in range(j, j+i):
                count[k] -= tmp

    for i in range(26):
        ans += count[i]

    for i in range(10, 3, -1):
        for j in range(10 - i + 1):
            tmp = min(countnum[j:j+i])
            ans += tmp * 3
            for k in range(j, j+i):
                countnum[k] -= tmp

    for i in range(10):
        ans += countnum[i]

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the occurrences of each character in the string, and then calculates the minimum number of occurrences of any substring of length 3 or more. It then prints the result.
