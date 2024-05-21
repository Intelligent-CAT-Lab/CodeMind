import sys

for line in sys.stdin:
    line = line.replace('.', ',')
    line = line.replace(',','')
    words = line.split(" ")
    count = 0

    for word in words:
        length = len(word)

        if length >= 3 and length <= 6:
            if count > 0:
                print(" ", end="")
            print(word[:length], end="")
            count += 1

    if count > 0:
        print()