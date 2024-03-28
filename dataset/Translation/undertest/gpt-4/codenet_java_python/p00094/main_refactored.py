class main:
    while True:
        try:
            inp = input()
            a, b = map(float, inp.split())
            print((a*b)/3.305785)
        except EOFError:
            break