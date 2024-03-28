```python
def main():
    s = input()
    ans = 101
    for i in range(26):
        target = chr(i + ord('a'))
        max_len = 0
        cur_len = 0
        for j in range(len(s)):
            if s[j] == target:
                cur_len = 0
            else:
                cur_len += 1
                max_len = max(max_len, cur_len)
        ans = min(ans, max_len)
        
    print(ans)

if __name__ == "__main__":
    main()
```
