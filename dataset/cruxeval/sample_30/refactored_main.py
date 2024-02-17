array = ["a", "b", "c"]
result = []
for elem in array:
    if elem.isascii() or (isinstance(elem, int) and not str(abs(elem)).isascii()):
        result.append(elem)
print(result)