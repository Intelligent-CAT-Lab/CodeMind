def convert_to_title(n):
    n -= 1
    out = []
    while n >= 0:
        n, y = divmod(n, 26)
        out.append(chr(y + ord('a')))
        if n == 0:
            break
    return ''.join(out[::-1])

n = int(input())
print(convert_to_title(n))