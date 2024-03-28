def gs():
    return input()

s = gs()

print((len(s) - len(s.replace("o", "")))*100 + 700)