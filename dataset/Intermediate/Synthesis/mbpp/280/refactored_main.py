dlist = [11,23,58,31,56,77,43,12,65,19]
item = 31
pos = 0
found = False
while pos < len(dlist) and not found:
    if dlist[pos] == item:
        found = True
    else:
        pos = pos + 1
print(found, pos)