input_string = 'biec'
table = str.maketrans('aioe', 'ioua')
while 'a' in input_string or 'A' in input_string:
    input_string = input_string.translate(table)
print(input_string)