import string

def toggle_case(c):
    if not c in string.ascii_letters:
        return c
    return string.ascii_letters[(string.ascii_letters.index(c) + 26) % 52]

s = input()
print(''.join(map(toggle_case, s)))

