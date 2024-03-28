```python
class p03393:
    def __init__(self):
        self._intMax = 2147483647
        self._intMin = -2147483648
        self._longMax = 9223372036854775807
        self._longMin = -9223372036854775808

    def solve(self):
        set_chars = set([chr(i) for i in range(97, 123)])
        line = input()
        for ch in line:
            if ch in set_chars:
                set_chars.remove(ch)
        
        if set_chars:
            print(line + set_chars.pop())
            return
        if line == "zyxwvutsrqponmlkjihgfedcba":
            print(-1)
            return
        self.next_permutation(line, "")

    def next_permutation(self, line, cur):
        if line[:len(cur)] > cur:
            return False
        
        if len(line) == len(cur):
            if line < cur:
                for i in range(len(line)):
                    print(cur[i], end='')
                    if line[i] != cur[i]:
                        break
                print('')
                return True
            else:
                return False
        
        for ch in range(97, 123):
            if chr(ch) not in cur:
                if self.next_permutation(line, cur + chr(ch)):
                    return True
        return False

if __name__ == '__main__':
    p = p03393()
    p.solve()
```
```
