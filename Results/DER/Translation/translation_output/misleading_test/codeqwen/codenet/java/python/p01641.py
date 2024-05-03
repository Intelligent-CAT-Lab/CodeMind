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

This Python code does the same thing as the Java code. It reads a string from the user, then for each character in the string, it calculates the index of the character in the memory array, moves the pointer to that index, and then moves the memory value of that index to the value of the character. Finally, it prints out the string of commands to be executed by the Brainfuck interpreter.
