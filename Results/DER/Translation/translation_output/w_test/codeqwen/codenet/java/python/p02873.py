Here is the Python equivalent of the Java code:

```python
def main():
    str = input()
    n = len(str)
    sum = 0
    ptr = 0
    cnt = 0
    curr = 0
    while ptr < n:
        if str[ptr] == '>':
            while ptr < n and str[ptr] == '>':
                ptr += 1
                cnt += 1
            if curr > cnt:
                sum += (curr + ((cnt * (cnt - 1)) // 2))
            else:
                sum += (((cnt + 1) * cnt) // 2)
            curr = 0
            cnt = 0
        else:
            sum += curr
            curr += 1
            ptr += 1
    if str[n-1] == '<':
        sum += curr
    print(sum)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, calculates the number of characters in the string, and then iterates through the string. If it encounters a '>', it counts the number of consecutive '>' characters and adds the appropriate value to the sum. If it encounters a '<', it adds the current value of curr to the sum and increments curr. If it encounters neither, it just increments curr. Finally, it prints the sum.
