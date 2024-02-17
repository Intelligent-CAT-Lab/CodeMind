brackets = 10
depth = 0
for b in brackets:
    if b == "<":
        depth += 1
    else:
        depth -= 1
    if depth < 0:
        print(False)
print(depth == 0)