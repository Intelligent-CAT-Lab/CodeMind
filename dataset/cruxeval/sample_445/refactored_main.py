names = "carrot, banana, and strawberry"
parts = names.split(',')
for i, part in enumerate(parts):
    parts[i] = part.replace(' and', '+').title().replace('+', ' and')
print(', '.join(parts))