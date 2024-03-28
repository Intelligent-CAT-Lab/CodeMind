while True:
    try:
        str = input()
        str = str.replace('.', ',')
        str = str.replace(',', ' ')
        tokens = str.split(" ")
        count = 0

        for i in range(len(tokens)):
            n = len(tokens[i])

            if 3 <= n <= 6:
                if count > 0: print(" ", end="")
                print(tokens[i][:n], end="")
                count += 1
        if count > 0: print()
    except EOFError:
        break