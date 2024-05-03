Here is the Python equivalent of the Java code:

```python
def main():
    mem = [0]*10
    pos = 0
    s = input()
    sb = []
    for c in s:
        idx = (ord(c) - 33) // 10
        while idx < pos:
            sb.append('<')
            pos -= 1
        while idx > pos:
            sb.append('>')
            pos += 1
        while abs(mem[pos] - ord(c)) > 0:
            if mem[pos] < ord(c):
                sb.append('+')
            else:
                sb.append('-')
            mem[pos] += 1 if mem[pos] < ord(c) else -1
        sb.append('.')
    print(''.join(sb))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then for each character in the string, it calculates the index of the character in the memory array, and moves the pointer to that index. Then it calculates the difference between the current value in the memory array and the ASCII value of the character, and moves the memory value in the memory array by that difference. Finally, it appends a '.' to the string builder. After all characters have been processed, it prints the string builder.
