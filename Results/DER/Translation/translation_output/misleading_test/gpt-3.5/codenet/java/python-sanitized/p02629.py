def java_to_python():
    N = int(input())
    x = 0
    y = 0
    out = ['\0'] * 11

    for i in range(11):
        N -= 1
        x = N // 26
        y = N % 26
        out[i] = chr(ord('a') + y)
        if x == 0:
            break
        N = x

    for i in range(10, -1, -1):
        if out[i] == '\0':
            continue
        print(out[i], end='')

java_to_python()