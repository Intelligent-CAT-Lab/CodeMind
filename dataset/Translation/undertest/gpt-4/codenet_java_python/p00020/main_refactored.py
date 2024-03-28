class main:
    while True:
        try:
            s = input()
            t = ""
            for c in s:
                t += c.upper()
            print(t)
        except EOFError:  # To handle the end of input
            break