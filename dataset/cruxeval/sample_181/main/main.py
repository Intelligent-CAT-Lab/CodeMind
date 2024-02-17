def f(s):
    count = 0
    digits = ""
    for c in s:
        if c.isdigit():
            count += 1
            digits += c
    return [digits, count]