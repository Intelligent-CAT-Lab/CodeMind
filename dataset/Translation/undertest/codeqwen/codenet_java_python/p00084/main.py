import re

while True:
    try:
        str = input()
        str = str.replace('.', ',')
        str = str.replace(',', ' ')
        tokens = str.split()
        count = 0

        for token in tokens:
            n = len(token)

            if 3 <= n <= 6:
                if count > 0:
                    print(' ', end='')
                print(token[:n], end='')
                count += 1

        if count > 0:
            print()
    except EOFError:
        break