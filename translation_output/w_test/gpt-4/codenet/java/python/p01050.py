Here's the translated Python code based on the Java code you provided:

```python
def main():
    s = input()

    count = [0] * 26
    countnum = [0] * 10
    
    for char in s:
        if '0' <= char <= '9':
            countnum[int(char)] += 1
        if 'a' <= char <= 'z':
            count[ord(char) - ord('a')] += 1
            
    ans = 0
    for i in range(26, 2, -1):
        for j in range(0, 27 - i):
            tmp = min(count[j:j + i])
            ans += tmp * 3
            for k in range(j, j + i):
                count[k] -= tmp
            
    ans += sum(count)
    
    for i in range(10, 2, -1):
        for j in range(0, 11 - i):
            tmp = min(countnum[j:j + i])
            ans += tmp * 3
            for k in range(j, j + i):
                countnum[k] -= tmp
                
    ans += sum(countnum)
    
    print(ans)

if __name__ == "__main__":
    main()
```

You can run this Python program and provide the input as specified. It will produce the expected output. Make sure to input your string without any additional prompts, as the Python `input()` function reads from standard input without a prompt message.
