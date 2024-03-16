```python
import io
import sys

def solve():
    n = nl()
    perm = permutation_whose_number_of_increasing_sequence_is_k(n)
    out.write(str(len(perm)*2) + '\n')
    for i in range(1, len(perm)+1):
        if i > 1:
            out.write(' ')
        out.write(str(i))
    for i in range(len(perm)):
        out.write(' ' + str(perm[i]+1))
    out.write('\n')

def permutation_whose_number_of_increasing_sequence_is_k(K):
    cur = (1 << K.bit_length()) - 1
    lst = []
    for i in range(bin(cur).count('1')):
        lst.append(i)
    p = bin(cur).count('1')
    for d in range(bin(cur).count('1')-1, -1, -1):
        x = 1 << d
        if cur + x <= K:
            cur += x
            lst.insert(d, p)
            p += 1
    return lst

if __name__ == '__main__':
    S = int(round(time.time() * 1000))
    INPUT = sys.stdin.read()
    is = sys.stdin if len(INPUT) == 0 else io.BytesIO(INPUT.encode())
    out = sys.stdout

    solve()
    out.flush()
    G = int(round(time.time() * 1000))
    print(str(G-S) + "ms")
```
