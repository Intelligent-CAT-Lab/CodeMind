S = "01B0"
w = ""
for c in S:
    if c == "B":
        if len(w) > 0:
            w = w[:-1]
    else:
        w += c
print w
