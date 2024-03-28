def convert_char(char):
    if char == 'a':
        return 'b'
    elif char == 'b':
        return 'c'
    elif char == 'c':
        return 'd'
    elif char == 'd':
        return 'e'
    elif char == 'e':
        return 'f'
    elif char == 'f':
        return 'g'
    elif char == 'g':
        return 'h'
    elif char == 'h':
        return 'i'
    elif char == 'i':
        return 'j'
    elif char == 'j':
        return 'k'
    elif char == 'k':
        return 'l'
    elif char == 'l':
        return 'm'
    elif char == 'm':
        return 'n'
    elif char == 'n':
        return 'o'
    elif char == 'o':
        return 'p'
    elif char == 'p':
        return 'q'
    elif char == 'q':
        return 'r'
    elif char == 'r':
        return 's'
    elif char == 's':
        return 't'
    elif char == 't':
        return 'u'
    elif char == 'u':
        return 'v'
    elif char == 'v':
        return 'w'
    elif char == 'w':
        return 'x'
    elif char == 'x':
        return 'y'
    elif char == 'y':
        return 'z'
    else:
        return ''

input_char = input()
output_char = convert_char(input_char)
print(output_char)