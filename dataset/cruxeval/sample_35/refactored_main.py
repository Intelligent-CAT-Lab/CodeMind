pattern = " B "
items = [" bBb ", " BaB ", " bB", " bBbB ", " bbb"]
result = []
for text in items:
    pos = text.rfind(pattern)
    if pos >= 0:
        result.append(pos)

print(result)