def main():
    mem = [0] * 10
    pos = 0
    sb = []
    s = input()
    for c in s:
        idx = (ord(c) - 33) // 10
        for i in range(abs(pos - idx)):
            sb.append('<' if idx < pos else '>')
        pos = idx
        for i in range(abs(mem[pos] - ord(c))):
            sb.append('-' if ord(c) < mem[pos] else '+')
        mem[pos] = ord(c)
        sb.append('.')
    print(''.join(sb))

if __name__ == '__main__':
    main()