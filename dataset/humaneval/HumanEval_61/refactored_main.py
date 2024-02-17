brackets = 1
depth = 0
for b in brackets:
    if b == "(":
        depth += 1
    else:
        depth -= 1
    if depth < 0:
        print(False)
        break
print(depth == 0)