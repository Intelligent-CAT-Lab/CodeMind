import sys

def main():
    mem = [0]*10
    pos = 0
    sb = []
    for c in sys.stdin.readline().strip():
        idx = (ord(c) - 33) // 10
        for _ in range(abs(pos - idx)):
            sb.append('<' if idx < pos else '>')
        pos = idx
        for _ in range(abs(mem[pos] - ord(c))):
            sb.append('-' if ord(c) < mem[pos] else '+')
        mem[pos] = ord(c)
        sb.append('.')
    print(''.join(sb))

if __name__ == "__main__":
    main()