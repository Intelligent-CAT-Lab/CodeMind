def main():
    mem = [0]*10
    pos = 0
    s = input()
    sb = []
    for c in s:
        idx = (ord(c) - 33) // 10
        while idx < pos:
            sb.append('<')
            pos -= 1
        while idx > pos:
            sb.append('>')
            pos += 1
        while abs(mem[pos] - ord(c)) > 0:
            if mem[pos] < ord(c):
                sb.append('+')
            else:
                sb.append('-')
            mem[pos] += 1 if mem[pos] < ord(c) else -1
        sb.append('.')
    print(''.join(sb))

if __name__ == "__main__":
    main()