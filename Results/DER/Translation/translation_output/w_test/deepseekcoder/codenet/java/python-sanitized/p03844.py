def p03844():
    import sys
    a = int(sys.stdin.readline().strip())
    s = sys.stdin.readline().strip()
    b = int(sys.stdin.readline().strip())
    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b
    print(c)

p03844()