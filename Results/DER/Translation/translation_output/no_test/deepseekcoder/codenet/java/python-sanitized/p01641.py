import sys

def main():
    mem = [0]*10
    pos = 0
    sb = []
    for c in input():
        c = ord(c)
        idx = (c - 33) // 10
        for _ in range(abs(pos - idx)):
            sb.append('<' if idx < pos else '>')
        pos = idx
        for _ in range(abs(mem[pos] - c)):
            sb.append('-' if c < mem[pos] else '+')
        mem[pos] = c
        sb.append('.')
    print(''.join(sb))

if __name__ == "__main__":
    main()