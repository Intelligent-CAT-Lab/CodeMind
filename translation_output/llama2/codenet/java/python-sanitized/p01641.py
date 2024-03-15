import sys

def main():
    n = int(sys.stdin.readline())
    mem = [0] * 10
    pos = 0
    sb = ''
    for c in sys.stdin.readline().strip():
        idx = ord(c) - 33
        for i in range(abs(pos - idx)):
            sb += '<' if idx < pos else '>'
        pos = idx
        for i in range(abs(mem[pos] - c)):
            sb += '-' if c < mem[pos] else '+'
        mem[pos] = c
        sb += '.'
    print(sb)

if __name__ == '__main__':
    main()