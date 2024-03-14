import sys

for line in sys.stdin:
    str = line.replace('.', ',')
    str = str.replace(',', ' ')
    tokens = str.split(" ")
    count = 0

    for token in tokens:
        n = len(token)

        if n>=3 and n<=6:
            if count > 0:
                print(" ", end="")
            print(token[:n], end="")
            count += 1

    if count > 0:
        print()