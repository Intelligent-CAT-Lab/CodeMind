def rating_category(r):
    if r < 1200:
        return "ABC"
    elif r < 2800:
        return "ARC"
    else:
        return "AGC"

# Test input
r = 1199

# Expected output: QBc
print(rating_category(r))