def main():
    N = int(input())
    x, y = 0, 0
    out = [''] * 11  # equivalent to char[] out = new char[11] in Java

    for i in range(11):
        N -= 1
        x = N // 26
        y = N % 26
        out[i] = chr(ord('a') + y)
        if x == 0:
            break
        N = x

    for i in range(10, -1, -1):
        if out[i] == '':
            continue
        print(out[i], end='')

if __name__ == "__main__":
    main()