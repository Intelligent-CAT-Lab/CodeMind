def p02629():
    N = int(input())

    out = [''] * 11  # Assuming equivalent to char[] out = new char[11] in Java

    for i in range(11):
        N = N - 1
        x = N // 26
        y = N % 26
        out[i] = chr(ord('a') + y)
        if x == 0:
            break
        N = x

    for i in reversed(range(11)):
        if out[i] == '':
            continue
        print(out[i], end='')

p02629()