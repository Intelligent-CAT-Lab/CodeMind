def main():
    inp = input()
    mem = [0] * 10
    pos = 0
    output = ""

    for c in inp:
        idx = (ord(c) - 33) // 10
        for i in range(abs(pos - idx)):
            output += '<' if idx < pos else '>'
        pos = idx

        for i in range(abs(mem[pos] - ord(c))):
            output += '-' if ord(c) < mem[pos] else '+'
        mem[pos] = ord(c)
        output += '.'

    print(output)

if __name__ == "__main__":
    main()