def p03844():
    import sys
    import io
    input_text = io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8')
    a = int(input_text.readline().strip())
    s = input_text.readline().strip()
    b = int(input_text.readline().strip())
    if s == "+":
        c = a + b
    elif s == "-":
        c = a - b
    print(c)

p03844()