a,b = (int(_) for _ in "3 1".split())
print('Yes') if (a in (1,3) and b in (1,3)) \
    else print('No')