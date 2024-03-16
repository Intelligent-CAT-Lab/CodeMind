s = input()
array = list(s)

for i in range(0, len(s), 2):
    print(array[i], end='')

# Adding an extra newline at the end to match Java's default behavior
print()