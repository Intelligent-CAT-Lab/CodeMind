items = ['123', 'cat', 'd dee']
result = []
for item in items:
    for d in item:
        if not d.isdigit():
            result.append(d)
print(result)