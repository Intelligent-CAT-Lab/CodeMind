value = '234rtccde'
char = 'e'
total = 0
for c in value:
    if c == char or c == char.lower():
        total += 1
print(total)