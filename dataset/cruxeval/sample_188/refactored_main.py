strings = ["a", "b", "car", "d"]
new_strings = []
for string in strings:
    first_two = string[:2]
    if first_two.startswith('a') or first_two.startswith('p'):
        new_strings.append(first_two)

print(new_strings)