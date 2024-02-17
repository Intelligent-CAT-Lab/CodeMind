s = '"Makers of a Statement"'
s = s.replace('"', '')
lst = list(s)
col = 0
count = 1
while col < len(lst) and lst[col] in ".:,":
    if lst[col] == ".":
        count = lst[col] + 1
    col += 1
print(s[col+count:])