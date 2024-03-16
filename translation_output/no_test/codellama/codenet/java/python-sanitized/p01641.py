import sys

def main():
    mem = [0] * 10
    pos = 0
    sb = ""
    for c in sys.stdin.readline().strip():
        idx = (ord(c) - 33) // 10
        for i in range(abs(pos - idx)):
            sb += "<" if pos < idx else ">"
        pos = idx
        for i in range(abs(mem[pos] - ord(c))):
            sb += "-" if ord(c) < mem[pos] else "+"
        mem[pos] = ord(c)
        sb += "."
    print(sb)

if __name__ == "__main__":
    main()