```python
import sys
import math

class p01989:
    
    @staticmethod
    def solve(in_stream, out_stream):

        def has_next_byte():
            if p < length:
                return True
            else:
                p = 0
                try:
                    length = in_stream.read(buffer)
                except Exception as e:
                    e.printStackTrace()
                if length <= 0:
                    return False
            return True

        def read_byte():
            if has_next_byte():
                return buffer[p]
            return -1

        def is_printable(n):
            return 33 <= n <= 126

        def skip():
            while has_next_byte() and not is_printable(buffer[p]):
                p += 1

        def has_next():
            skip()
            return has_next_byte()

        def next_line():
            if not has_next():
                raise StopIteration()
            sb = ''
            t = read_byte()
            while is_printable(t):
                sb += chr(t)
                t = read_byte()
            return sb

        s = next_line()
        length = len(s)
        ans = 0

        for i in range(1, length - 2):
            for j in range(i + 1, length - 1):
                for k in range(j + 1, length):

                    a = [s[0:i], s[i:j], s[j:k], s[k:length]]

                    for x in range(4):
                        if len(a[x]) != len(str(int(a[x]))):
                            continue

                    b = [int(a[0]), int(a[1]), int(a[2]), int(a[3])]
                    if b[0] <= 255 and b[1] <= 255 and b[2] <= 255 and b[3] <= 255:
                        ans += 1

        out_stream.write(str(ans) + "\n")


if __name__ == "__main__":
    p01989.solve(sys.stdin.buffer, sys.stdout.buffer)
```
