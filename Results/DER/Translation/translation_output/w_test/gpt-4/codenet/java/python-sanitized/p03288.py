def rate_judging_system(r):
    if r < 1200:
        return "ABC"
    elif r < 2800:
        return "ARC"
    else:
        return "AGC"

# Test input
r = 1199

# Expected output: "ABC"
print(rate_judging_system(r))