def swap_chars(s):
    if len(s) == 3:
        return s[2] + s[1] + s[0]
    else:
        return s

s = input()
print(swap_chars(s))