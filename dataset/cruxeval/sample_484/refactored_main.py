arr = ['91', '16', '6r', '5r', 'egr', '', 'f', 'q1f', '-2']
result = []
for item in arr:
    try:
        if item.isnumeric():
            result.append(int(item)*2)
    except ValueError:
        result.append(item[::-1])
print(result)