def convert_case(s):
    return ''.join([char.upper() if char.islower() else char.lower() for char in s])

print(convert_case(input()))