class main:
    while True:
        try:
            a, b = map(float, input().split())
            print((a * b) / 3.305785)
        except EOFError:
            break