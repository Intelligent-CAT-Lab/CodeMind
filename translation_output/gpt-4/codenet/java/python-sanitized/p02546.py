# Get an input string from the user
s = input()

# Check if the string ends with 's' and append accordingly
if s.endswith('s'):
    print(s + 'es')
else:
    print(s + 's')