s = [6, 1, 2, 3]
while len(s) > 1:
    s.clear()
    s.append(len(s))
print(s.pop())