def f(s):
    s = s.replace('"', '')
    lst = list(s)
    col = 0
    count = 1
    while col < len(lst) and lst[col] in ".:,":
        if lst[col] == ".":
            count = ls[col] + 1
        col += 1
    return s[col+count:]