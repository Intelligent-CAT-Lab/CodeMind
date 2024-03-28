import sys

def main():
    mem = [0]*10
    pos = 0
    s = sys.stdin.readline().strip()
    bf = []
    for c in s:
        idx = (ord(c) - 33) // 10
        for _ in range(abs(pos - idx)):
            bf.append('<' if idx < pos else '>')
        pos = idx
        for _ in range(abs(mem[pos] - ord(c))):
            bf.append('-' if ord(c) < mem[pos] else '+')
        mem[pos] = ord(c)
        bf.append('.')
    print(''.join(bf))

if __name__ == "__main__":
    main()