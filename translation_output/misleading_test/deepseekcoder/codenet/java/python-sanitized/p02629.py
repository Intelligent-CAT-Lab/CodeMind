def convert_to_title(n):
    n -= 1
    out = ''
    while n >= 0:
        n, remainder = divmod(n, 26)
        out = chr(ord('a') + remainder) + out
    return out

print(convert_to_title(int(input())))