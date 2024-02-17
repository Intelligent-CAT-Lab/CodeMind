chars = "acbced"
s = ""
for ch in chars:
    if chars.count(ch) % 2 == 0:
        s += ch.upper()
    else:
        s += ch
print(s)