import sys

def encode(key):
    if key == ' ':
        return '101'
    elif key == '\'':
        return '000000'
    elif key == ',':
        return '000011'
    elif key == '-':
        return '10010001'
    elif key == '.':
        return '010001'
    elif key == '?':
        return '000001'
    elif key == 'A':
        return '100101'
    elif key == 'B':
        return '10011010'
    elif key == 'C':
        return '0101'
    elif key == 'D':
        return '0001'
    elif key == 'E':
        return '110'
    elif key == 'F':
        return '01001'
    elif key == 'G':
        return '10011011'
    elif key == 'H':
        return '010000'
    elif key == 'I':
        return '0111'
    elif key == 'J':
        return '10011000'
    elif key == 'K':
        return '0110'
    elif key == 'L':
        return '00100'
    elif key == 'M':
        return '10011001'
    elif key == 'N':
        return '10011110'
    elif key == 'O':
        return '00101'
    elif key == 'P':
        return '111'
    elif key == 'Q':
        return '10011111'
    elif key == 'R':
        return '1000'
    elif key == 'S':
        return '00110'
    elif key == 'T':
        return '00111'
    elif key == 'U':
        return '10011100'
    elif key == 'V':
        return '10011101'
    elif key == 'W':
        return '000010'
    elif key == 'X':
        return '10010010'
    elif key == 'Y':
        return '10010011'
    elif key == 'Z':
        return '10010000'
    else:
        return ''

def decode(key):
    if key == '00000':
        return 'A'
    elif