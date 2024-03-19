def swap_chars(s):
    if len(s) == 3:
        return s[2] + s[1] + s[0]
    else:
        return s

print(swap_chars(input()))