s = "BBBWW"
print(sum(a != b for a, b in zip(s[1:], s[:-1])))