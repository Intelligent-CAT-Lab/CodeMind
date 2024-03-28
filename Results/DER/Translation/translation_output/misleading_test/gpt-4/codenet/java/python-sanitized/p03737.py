input_string = input().split()
output = ''.join(word[0].upper() for word in input_string[:3])
print(output)