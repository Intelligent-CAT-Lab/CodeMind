def min_length(s):
    c = 0
    len = 0
    for i in s:
        if i == 'T':
            c -= 1
        else:
            if c < 0:
                len -= c
                c = 1
            else:
                c += 1
    len += abs(c)
    return len

# Test input
print(min_length("TSTTSS"))