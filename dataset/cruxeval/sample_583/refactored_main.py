text = "t\nza\na"
ch = "t"
result = []
for line in text.splitlines():
    if len(line) > 0 and line[0] == ch:
        result.append(line.lower())
    else:
        result.append(line.upper())
print("\n".join(result))