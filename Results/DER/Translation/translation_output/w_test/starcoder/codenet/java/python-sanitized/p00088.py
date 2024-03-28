import sys

def encode(c):
    if c =='':
        return '101'
    elif c == '\'':
        return '000000'
    elif c == ',':
        return '000011'
    elif c == '-':
        return '10010001'
    elif c == '.':
        return '010001'
    elif c == '?':
        return '000001'
    elif c == 'A':
        return '100101'
    elif c == 'B':
        return '10011010'
    elif c == 'C':
        return '0101'
    elif c == 'D':
        return '0001'
    elif c == 'E':
        return '110'
    elif c == 'F':
        return '01001'
    elif c == 'G':
        return '10011011'
    elif c == 'H':
        return '010000'
    elif c == 'I':
        return '0111'
    elif c == 'J':
        return '10011000'
    elif c == 'K':
        return '0110'
    elif c == 'L':
        return '00100'
    elif c == 'M':
        return '10011001'
    elif c == 'N':
        return '10011110'
    elif c == 'O':
        return '00101'
    elif c == 'P':
        return '111'
    elif c == 'Q':
        return '10011111'
    elif c == 'R':
        return '1000'
    elif c == 'S':
        return '00110'
    elif c == 'T':
        return '00111'
    elif c == 'U':
        return '10011100'
    elif c == 'V':
        return '10011101'
    elif c == 'W':
        return '000010'
    elif c == 'X':
        return '10010010'
    elif c == 'Y':
        return '10010011'
    elif c == 'Z':
        return '100