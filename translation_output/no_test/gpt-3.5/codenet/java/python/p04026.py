```python
def main():
    s = input()
    last = [-1] * 26
    for i in range(len(s)):
        ch = ord(s[i]) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            print(last[ch] + 1, i + 1)
            return
        last[ch] = i
    print("-1 -1")

if __name__ == "__main__":
    main()
```
