```python
import sys
import io
import math

input_stream = sys.stdin
output_stream = sys.stdout
input_buffer = io.BytesIO()
input_buffer_pos = 0


def solve():
    s = next_input()
    if s[-1] == '?':
        total = 0
        for i in range(len(s) - 1):
            n = 11 - i
            q = 0
            p = int(s[i])
            if 1 <= n <= 6:
                q = n + 1
            else:
                q = n - 5
            total += q * p
        total %= 11
        if total <= 1:
            total = 0
        else:
            total = 11 - total
        output_stream.write(str(total) + '\n')
    else:
        check = int(s[-1])
        count = 0
        answer = 0
        for j in range(10):
            total = 0
            for i in range(len(s) - 1):
                n = 11 - i
                q = 0
                p = 0
                if s[i] == '?':
                    p = j
                else:
                    p = int(s[i])
                if 1 <= n <= 6:
                    q = n + 1
                else:
                    q = n - 5
                total += q * p
            total %= 11
            if total <= 1:
                total = 0
            else:
                total = 11 - total
            if check == total:
                count += 1
                answer = j
        if count == 1:
            output_stream.write(str(answer) + '\n')
        else:
            output_stream.write("MULTIPLE\n")


def main():
    solve()


def next_input():
    while True:
        ch = next_byte()
        if ch == -1:
            break
        if 33 <= ch <= 126:
            input_buffer.write(bytes((ch,)))
    return input_buffer.getvalue().decode()


def next_byte():
    global input_buffer_pos
    if input_buffer_pos >= len(input_buffer.getvalue()):
        return -1
    input_buffer_pos += 1
    return input_buffer.getvalue()[input_buffer_pos - 1]


if __name__ == "__main__":
    main()
```

