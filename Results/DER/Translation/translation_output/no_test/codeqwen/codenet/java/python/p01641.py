Here is the Python equivalent of the Java code:

```python
import sys

def main():
    mem = [0]*10
    pos = 0
    sb = []
    for c in sys.stdin.readline().strip():
        idx = (ord(c) - 33) // 10
        for i in range(abs(pos - idx)):
            sb.append('<' if idx < pos else '>')
        pos = idx
        for i in range(abs(mem[pos] - ord(c))):
            sb.append('-' if c < chr(mem[pos]) else '+')
        mem[pos] = ord(c)
        sb.append('.')
    print(''.join(sb))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, then for each character in the string, it calculates the index of the character in the memory array, and then it calculates the differences between the current position and the index of the character, and the differences between the current character and the character at the index in the memory array. It then appends the appropriate characters to the string builder, and finally prints the string builder.
