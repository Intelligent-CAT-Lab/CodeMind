class main:
    def p01641():
        mem = [0] * 10
        pos = 0
        sb = ""
        for c in input():
            idx = (ord(c) - 33) // 10
            for i in range(abs(pos - idx)):
                sb += "<" if idx < pos else ">"
            pos = idx
            for i in range(abs(mem[pos] - ord(c))):
                sb += "-" if ord(c) < mem[pos] else "+"
            mem[pos] = ord(c)
            sb += "."
        print(sb)
    
    p01641()